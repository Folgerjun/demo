package com.springlight.web.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlight.data.db.model.UnitConfig;
import com.springlight.data.service.UnitConfigService;

@Controller
public class ReportAction {
	
	@Autowired
	UnitConfigService mUnitConfigService;

	@RequestMapping(value = "/unit/report")
	public String index(String password, Model model){
		
		List<UnitConfig> unitConfigLs = mUnitConfigService.findReportLs();
		model.addAttribute("unitConfigLs", unitConfigLs);
		return "/unit_report";
	}
	
}
