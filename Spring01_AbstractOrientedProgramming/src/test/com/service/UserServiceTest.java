package com.service;

import com.dao.UserDao;
import org.junit.Test;

import com.model.User;
import com.spring.simulation.BeanFactory;
import com.spring.simulation.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory bf = new ClassPathXmlApplicationContext();
		UserService service =(UserService) bf.getBean("userService");
		UserDao dao =(UserDao) bf.getBean("userDao");
		service.setUserDao(dao);
		User u = new User();
		service.add(u);
	}

}
