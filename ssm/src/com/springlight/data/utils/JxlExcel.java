package com.springlight.data.utils;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springlight.data.db.dao.UnitBuildMapper;
import com.springlight.data.db.model.UnitBuild;

/**
 * jxl 操作 Excel
 * 
 * @author Folger
 *
 */
@Component
public class JxlExcel {

	@Autowired
	UnitBuildMapper mUnitBuildMapper;

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException, BiffException {

		// JxlWrite();
		// JxlRead();
		System.out.println("操作成功！");
	}

	/**
	 * 使用jxl进行写Excel操作
	 * 
	 * @throws IOException
	 * @throws RowsExceededException
	 * @throws WriteException
	 */
	public static void JxlWrite() throws IOException, RowsExceededException, WriteException {
		File xlsFile = new File("C:/1/jxl.xls");
		// 创建一个工作簿
		WritableWorkbook workbook = Workbook.createWorkbook(xlsFile);
		// 创建一个工作表
		WritableSheet sheet = workbook.createSheet("test1", 0);
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				// 向工作表中添加数据
				sheet.addCell(new Label(col, row, "data" + row + col));
			}
		}
		workbook.write();
		workbook.close();
	}

	/**
	 * 使用jxl进行读Excel操作
	 * 
	 * @throws BiffException
	 * @throws IOException
	 */
	public void JxlRead() throws BiffException, IOException {
		File xlsFile = new File("C:/1/build1.xls");
		// 获得工作簿对象
		Workbook workbook = Workbook.getWorkbook(xlsFile);
		// 获得所有工作表
		Sheet[] sheets = workbook.getSheets();
		// 遍历工作表
		if (sheets != null) {
			for (Sheet sheet : sheets) {
				// 获得行数
				int rows = sheet.getRows();
				// 获得列数
				int cols = sheet.getColumns();
				// 读取数据
				for (int row = 0; row < rows; row++) {
					String area = null;
					String name = null;
					String location = null;
					UnitBuild build = new UnitBuild();
					for (int col = 0; col < cols; col++) {
						// System.out.println(cols + "==");
						String value = sheet.getCell(col, row).getContents();
						switch (col) {

						case 0:
							// 行政区域
							area = value;
							break;
						case 1:
							// 建筑名称
							name = value;
							break;
						case 2:
							// 建筑位置
							location = value;
							break;

						default:
							break;
						}
						// System.out.printf("%20s", sheet.getCell(col,
						// row).getContents());
					}
					// System.out.println();
					// 存入数据库中
					build.setUnitArea(area);
					build.setUnitBuildName(name);
					build.setUnitBuildLocation(location);
					mUnitBuildMapper.insert(build);
				}
			}
			workbook.close();
		}
	}
}
