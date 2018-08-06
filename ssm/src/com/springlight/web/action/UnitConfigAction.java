package com.springlight.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.springlight.data.db.model.UnitConfig;
import com.springlight.data.service.UnitConfigService;

@Controller
public class UnitConfigAction {

	@Autowired
	UnitConfigService mUnitConfigService;
	
	@RequestMapping(value = "/unit/config/admin")
	public String index(String password, Model model){
		
		List<UnitConfig> unitConfigLs = mUnitConfigService.findUnitConfigLs();
		model.addAttribute("unitConfigLs", unitConfigLs);
		return "/unit_config";
	}
	
	@RequestMapping(value = "/unit/config/add", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String addUnitConfig(UnitConfig unitConfig){
		mUnitConfigService.addUnitConfig(unitConfig);
		return "success";
	}
	
	@RequestMapping(value = "/unit/config/del", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String delUnitConfig(String unitSign){
		mUnitConfigService.delUnitConfig(unitSign);
		return "success";
	}
	
	@RequestMapping(value = "/unit/config/update", produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String updateUnitConfig(UnitConfig unitConfig, String upUnitSign){
		System.out.println(JSON.toJSONString(unitConfig));
		mUnitConfigService.modifyUnitConfig(unitConfig, upUnitSign);
		return "success";
	}
	
}
