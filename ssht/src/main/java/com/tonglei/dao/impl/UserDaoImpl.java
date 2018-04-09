package com.tonglei.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tonglei.dao.UserDao;
import com.tonglei.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Serializable save(User user) {

		return sessionFactory.getCurrentSession().save(user);
	}
}
