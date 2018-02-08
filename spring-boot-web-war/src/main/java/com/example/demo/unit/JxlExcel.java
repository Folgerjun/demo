package com.example.demo.unit;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.springframework.stereotype.Component;

import com.example.demo.db.model.TbcInfo;

/**
 * jxl 操作 Excel
 * 
 * @author Folger
 *
 */
@Component
public class JxlExcel {

	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * 使用jxl进行写Excel操作
	 * 
	 * @throws IOException
	 * @throws RowsExceededException
	 * @throws WriteException
	 */
	public static void JxlWrite(List<TbcInfo> tbcInfos, OutputStream out) throws IOException, RowsExceededException,
			WriteException {

		// 创建一个工作簿
		WritableWorkbook workbook = Workbook.createWorkbook(out);
		// 创建一个工作表
		WritableSheet sheet = workbook.createSheet("预约信息", 0);
		int tbcInfoSize = tbcInfos.size();
		for (int row = 0; row <= tbcInfoSize; row++) {
			String[] mes = { "序号", "名字", "手机号", "提交时间" };
			if (row == 0) {
				// 记录标题
				for (int col = 0; col < mes.length; col++) {
					// 向工作表中添加数据
					sheet.addCell(new Label(col, row, mes[col]));
				}
			} else {
				// row 从1开始
				TbcInfo tbcInfo = tbcInfos.get(row - 1);
				String createTime = tbcInfo.getCreateTime() == null ? "" : sdf.format(tbcInfo.getCreateTime());
				String[] tbcInfoMes = { row + "", tbcInfo.getName(), tbcInfo.getTelphone(), createTime };
				for (int col = 0; col < mes.length; col++) {
					// 向工作表中添加数据
					sheet.addCell(new Label(col, row, tbcInfoMes[col]));
				}
			}

		}
		workbook.write();
		workbook.close();
		out.close();
	}
}
