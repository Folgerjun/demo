package com.example.demo.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.db.dao.TbcBtnCountMapper;
import com.example.demo.db.dao.TbcInfoMapper;
import com.example.demo.db.model.TbcBtnCount;
import com.example.demo.db.model.TbcInfo;
import com.example.demo.unit.JxlExcel;

/**
 * 报表控制器
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/report")
public class ReportController {

	@Autowired
	TbcInfoMapper mTbcInfoMapper;

	@Autowired
	TbcBtnCountMapper mTbcBtnCountMapper;

	/**
	 * 跳转预约信息报表
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/message")
	public String showMes(Model model) {

		List<TbcInfo> tbcInfos = mTbcInfoMapper.selectAllMes();

		model.addAttribute("tbcInfos", tbcInfos);

		return "report_message";
	}

	@RequestMapping("/btnmes")
	public String showNumMes(Model model) {

		List<TbcBtnCount> btnCounts = mTbcBtnCountMapper.selectAllMes();

		model.addAttribute("btnCounts", btnCounts);

		return "report_btn_message";
	}

	/**
	 * 导出Excel文件
	 * 
	 * @param response
	 * @throws RowsExceededException
	 * @throws WriteException
	 * @throws IOException
	 */
	@RequestMapping("/excel")
	public void excelMes(HttpServletResponse response) throws RowsExceededException, WriteException, IOException {

		String fileName = new String("预约信息.xls".getBytes("GB2312"), "ISO_8859_1");
		response.setContentType("application/vnd.ms-excel; charset=utf-8");
		response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
		response.setCharacterEncoding("utf-8");

		OutputStream out = response.getOutputStream();
		List<TbcInfo> tbcInfos = mTbcInfoMapper.selectAllMes();
		JxlExcel.JxlWrite(tbcInfos, out);
	}
}
