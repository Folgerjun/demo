package com.tonglei.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tonglei.dao.UserDao;
import com.tonglei.model.User;
import com.tonglei.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void test() {

		System.out.println("TEST...");
	}

	public Serializable save(User user) {
		return userDao.save(user);
	}
}
