package com.dao.impl;

import com.model.User;

public class UserDAOImpl1 extends UserDAOImpl{

	public void save(User u) {
		System.out.println("save start...");
		super.save(u);
	}
}
