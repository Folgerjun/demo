package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.db.dao.TbcBtnCountMapper;
import com.example.demo.db.model.TbcBtnCount;

@Controller
public class BtnCountController {

	@Autowired
	private TbcBtnCountMapper mTbcBtnCountMapper;
	
	@RequestMapping(value = "add_btn_count")
	@ResponseBody
	public void addBtnCount(TbcBtnCount btnCount){
		int result = mTbcBtnCountMapper.updateForBtnCount(btnCount.getBtnClass());
		if (result <= 0) {
			mTbcBtnCountMapper.insertSelective(btnCount);
		}
	}
	
}
