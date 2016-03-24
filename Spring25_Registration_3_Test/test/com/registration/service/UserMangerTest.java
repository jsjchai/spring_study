package com.registration.service;

import org.junit.Assert;
import org.junit.Test;

import com.registration.model.User;

public class UserMangerTest {

	@Test
	public void testExists() {
		User u =new User();
		u.setUsername("aaa");
		UserManager um=new UserManager();
		um.exists(u);
		boolean exists = um.exists(u);
		Assert.assertEquals(true, exists);
	}

	@Test
	public void testAdd() {
		UserManager um=new UserManager();
		User u = new User();
		u.setUsername("b1");
		u.setPassword("b1");
		boolean exists = um.exists(u);
		if(!exists) {
			um.add(u);
			u.setUsername("b1");
			Assert.assertEquals(true, um.exists(u));
			
		} else {
			Assert.fail("not added");
		}
	}

}
