package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.db.dao.TbcInfoMapper;
import com.example.demo.db.dao.TbcTelphoneMapper;
import com.example.demo.db.model.TbcInfo;
import com.example.demo.db.model.TbcTelphone;

/**
 * 活动主页面控制
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

	@Autowired
	TbcTelphoneMapper mTbcTelphoneMapper;

	@Autowired
	TbcInfoMapper mTbcInfoMapper;

	@RequestMapping("/page")
	public String goActivityPage() {

		return "appointment";
	}

	/**
	 * 验证手机号码是否存在数据库中
	 * 
	 * @param phone
	 * @return
	 */
	@RequestMapping("/check")
	@ResponseBody
	public String checkPhone(String phone, String name) {

		TbcTelphone tbcTelphone = mTbcTelphoneMapper.selectByTel(phone);

		if (tbcTelphone == null) {
			return "fail";
		} 
		
		TbcInfo eTbcInfo = mTbcInfoMapper.selectByTelphone(phone);
		if (eTbcInfo != null) {
			return "isExist";
		}
		
		TbcInfo tbcInfo = new TbcInfo();
		tbcInfo.setName(name);
		tbcInfo.setTelphone(phone);
		int insertNum = mTbcInfoMapper.insertSelective(tbcInfo);
		if (insertNum == 1) {
			return "success";
		}
		return "fail";
	}
}
