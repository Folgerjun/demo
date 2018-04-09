package com.tonglei.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tonglei.service.UserService;

public class SpringTest {

	@Test
	public void test() {
		// fail("Not yet implemented");

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");

		UserService userService = (UserService) context.getBean("userService");

		userService.test();
	}

}
