package com.example.shardingjdbc.service;

import java.util.List;

import com.example.shardingjdbc.entity.UserEntity;

public interface UserService {
	/**
	 * 保存 user 对象
	 * 
	 * @param user
	 */
	void saveUser(UserEntity user);

	/**
	 * 获取所有 user 对象
	 * 
	 * @return
	 */
	List<UserEntity> getUsers();
}
