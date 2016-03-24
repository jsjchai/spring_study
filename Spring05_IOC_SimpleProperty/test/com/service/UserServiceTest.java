package com.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ApplicationContext bf=new ClassPathXmlApplicationContext("beans.xml");
		UserService service =(UserService) bf.getBean("userService");
		UserDAOImpl udi=(UserDAOImpl) bf.getBean("u");
//		System.out.println(udi.toString());
		System.out.println(udi);
		User u=new User();
		service.add(u);
	}

}
