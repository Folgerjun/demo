package com.tonglei.dao;

import java.io.Serializable;

import com.tonglei.model.User;

public interface UserDao {

	/**
	 * 保存用户
	 * 
	 * @param user
	 */
	Serializable save(User user);

}
