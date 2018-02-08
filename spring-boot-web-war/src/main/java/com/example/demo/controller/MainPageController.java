package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页跳转
 * 
 * @author Administrator
 *
 */
@Controller
// @RestController 相当于 @Controller + @ResponseBody 都以json格式返回
public class MainPageController {

	@RequestMapping("/index")
	public String hello() {

		return "index";

	}
}
