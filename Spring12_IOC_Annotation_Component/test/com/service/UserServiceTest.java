package com.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext bf=new ClassPathXmlApplicationContext("beans.xml");
		UserService us=(UserService)bf.getBean("userService");
		us.add(new User());
	}

}
