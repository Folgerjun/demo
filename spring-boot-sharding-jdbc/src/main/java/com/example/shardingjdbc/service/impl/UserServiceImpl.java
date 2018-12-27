package com.example.shardingjdbc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.shardingjdbc.entity.UserEntity;
import com.example.shardingjdbc.repository.UserRepository;
import com.example.shardingjdbc.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserRepository userRepository;

	@Override
	public void saveUser(UserEntity user) {
		userRepository.save(user);
	}

	@Override
	public List<UserEntity> getUsers() {
		List<UserEntity> users = userRepository.findAll();
		return users;
	}

}
