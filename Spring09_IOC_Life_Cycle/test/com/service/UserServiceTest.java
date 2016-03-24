package com.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		 ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("beans.xml");
		UserService us=(UserService)cpx.getBean("userService");
		//UserService us1=(UserService)cpx.getBean("userService");
		//ÎÞ·¨destroy
		cpx.close();
	}

}
