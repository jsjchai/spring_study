package com.dao.impl;

import com.dao.UserDao;
import com.model.User;

/**
 * @author jsjchai
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void save(User u) {
		System.out.println("user saved");
	}

	

}
