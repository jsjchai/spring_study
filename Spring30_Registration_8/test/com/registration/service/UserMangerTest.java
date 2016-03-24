package com.registration.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.registration.model.User;
import com.registration.service.impl.UserManagerImpl;



public class UserMangerTest {

	@Test
	public void testExists() {
		User u =new User();
		u.setUsername("aaa");
		UserManager um=new UserManagerImpl();
		um.exists(u);
		boolean exists = um.exists(u);
		Assert.assertEquals(true, exists);
	}

	@Test
	public void testAdd() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("beans.xml");
		UserManagerImpl um=(UserManagerImpl) bf.getBean("userManagerImpl");
		User u=new User();
		u.setUsername("ddd");
		u.setPassword("111");
		boolean exists = um.exists(u);
		if(!exists) {
			um.add(u);
			u.setUsername("ddd");
			Assert.assertEquals(true,um.exists(u));
			
		} else {
			Assert.fail("not added");
		}
	}

}
