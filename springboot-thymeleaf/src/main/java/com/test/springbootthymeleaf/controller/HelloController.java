package com.test.springbootthymeleaf.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.springbootthymeleaf.model.User;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String goThy(Model model) {

		String age = "24";
		String name = "Folger";
		String sex = "男";
		model.addAttribute("age", age);
		model.addAttribute("name", name);
		model.addAttribute("sex", sex);

		User user = new User();
		user.setAge(age);
		user.setName(name);
		user.setSex(sex);
		model.addAttribute("User", user);

		Map<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("index", "3");
		model.addAttribute("dataMap", dataMap);

		return "hello";
	}

}
