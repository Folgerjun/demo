package com.tonglei.service;

import java.io.Serializable;

import com.tonglei.model.User;

public interface UserService {

	/**
	 * 测试方法接口
	 */
	void test();

	/**
	 * 保存用户
	 * 
	 * @param user
	 * @return
	 */
	Serializable save(User user);

}
