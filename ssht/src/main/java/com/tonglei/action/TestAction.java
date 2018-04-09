package com.tonglei.action;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tonglei.model.User;
import com.tonglei.service.UserService;

@ParentPackage("basePackage")
@Action(value = "test")
@Namespace("/")
public class TestAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Autowired
	private UserService userService;

	public String test() {
		System.out.println("进入TestAction...");
		userService.test();

		return SUCCESS;
	}

	public String saveUser() {
		User user = new User();
		user.setId(5);
		user.setAge(24);
		user.setHeight(176d);
		user.setName("Folger");
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		userService.save(user);

		this.user = user;

		return SUCCESS;
	}
}
