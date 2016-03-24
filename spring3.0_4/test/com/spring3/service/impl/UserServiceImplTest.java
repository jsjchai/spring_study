package com.spring3.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.spring3.model.User;
import com.spring3.service.UserService;

@ContextConfiguration("classpath:beans.xml")
public class UserServiceImplTest extends AbstractJUnit4SpringContextTests{
	
	@Resource(name="userService")
	private UserService userService;
	
	@Test
	public void testAdd() {
		this.userService.add(new User());
	}

}

