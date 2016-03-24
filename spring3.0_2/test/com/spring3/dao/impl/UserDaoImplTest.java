package com.spring3.dao.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.spring3.dao.UserDao;
import com.spring3.model.User;

@ContextConfiguration("classpath:beans.xml")
public class UserDaoImplTest extends AbstractJUnit4SpringContextTests{

	@Resource(name="userDao")
	private UserDao userDao;
	@Test
	public void testSava()  {
		this.userDao.sava(new User());
	}

}
