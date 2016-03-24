package com.spring3.dao.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring3.dao.UserDao;
import com.spring3.model.User;

public class UserDaoImplTest2 {

	@Test
	public void testSava() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userdao = (UserDao) context.getBean("userDao", UserDao.class);
		
		System.out.println(userdao.getClass());
		//UserDAO userDAO = (UserDAO)context.getBean("userDAO");
		userdao.sava(new User());
	}

}
