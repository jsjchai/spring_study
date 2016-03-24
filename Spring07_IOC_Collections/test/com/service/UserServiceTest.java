package com.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDAO;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext bf=new ClassPathXmlApplicationContext("beans.xml");
		UserDAO u =(UserDAO) bf.getBean("u");
		
		System.out.println(u);
	}
}
