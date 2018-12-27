package com.example.shardingjdbc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shardingjdbc.entity.UserEntity;
import com.example.shardingjdbc.service.UserService;
import com.google.gson.Gson;

/**
 * 用户测试接口类
 * 
 * @author ffj
 *
 */
@RestController
public class UserController {

	@Resource
	private UserService userService;

	@PostMapping("/save")
	public String saveUser() {
		UserEntity user = new UserEntity(1, "张三", 22);
		userService.saveUser(user);
		return "success";
	}

	@PostMapping("/getUser")
	public String getUsers() {
		List<UserEntity> users = userService.getUsers();
		return new Gson().toJson(users);
	}

}
