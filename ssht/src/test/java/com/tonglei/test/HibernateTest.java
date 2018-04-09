package com.tonglei.test;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tonglei.model.User;
import com.tonglei.service.UserService;

public class HibernateTest {

	private UserService userService;

	@Before
	public void before() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring.xml", "spring-hibernate.xml" });

		userService = (UserService) context.getBean("userService");

		System.out.println("-----START-----");
	}

	@Test
	public void test() {
		User user = new User();
		user.setId(2);
		user.setAge(24);
		user.setHeight(176d);
		user.setName("Folger");
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		userService.save(user);
	}

	@After
	public void after() {
		System.out.println("-----END-----");
	}

}
