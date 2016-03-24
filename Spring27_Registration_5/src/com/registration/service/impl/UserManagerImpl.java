package com.registration.service.impl;

import com.registration.dao.UserDao;
import com.registration.dao.impl.UserDaoImpl;
import com.registration.model.User;
import com.registration.service.UserManager;

public class UserManagerImpl implements UserManager {

	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean exists(User u) {
		return userDao.checkUserExistsWithName(u.getUsername());
	}

	@Override
	public void add(User u) {
		userDao.save(u);
	}
}
