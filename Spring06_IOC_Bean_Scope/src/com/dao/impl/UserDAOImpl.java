package com.dao.impl;

import com.dao.UserDAO;
import com.model.User;

public class UserDAOImpl implements UserDAO {

	public void save(User u) {
		System.out.println("user saved");
	}
}
