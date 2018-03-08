package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RestController 相当于 @Controller + @ResponseBody 都以json格式返回
public class HelloWorld {

	@RequestMapping("/hello")
	public String hello() {

		return "hello";

	}

	@RequestMapping("/learnVue")
	public String learnVue() {

		return "learnVue";

	}

}
