package com.dao.impl;

import com.aop.LogInterceptor;
import com.dao.UserDAO;
import com.model.User;

public class UserDAOImpl2 implements UserDAO{

	private UserDAO userDAO=new UserDAOImpl();
	public void save(User u) {
		//System.out.println("save start...");
		new LogInterceptor().beforeMethod(null);
		userDAO.save(u);
	}
	@Override
	public void delete() {
		System.out.println("user deleted");
	}
}
