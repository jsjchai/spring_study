package com.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext bf=new ClassPathXmlApplicationContext("beans.xml");
		UserService service =(UserService) bf.getBean("userService");
		UserService service1 =(UserService) bf.getBean("userService");
		
		//scope="singleton"(Default) ---->true
		//scope="prototype"---->false
		System.out.println(service==service1);
		
		User u=new User();
		service.add(u);
	}

}
