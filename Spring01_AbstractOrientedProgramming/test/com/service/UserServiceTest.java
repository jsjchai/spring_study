package com.service;

import org.junit.Test;

import com.model.User;
import com.spring.simulation.BeanFactory;
import com.spring.simulation.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory bf=new ClassPathXmlApplicationContext();
		UserService service =(UserService) bf.getBean("userService");
//		UserDAO udo=(UserDAO) bf.getBean("u");
//		service.setUserdio(udo);
		User u=new User();
		service.add(u);
	}

}
