package com.spring3.service.impl;

import com.spring3.dao.UserDao;
import com.spring3.model.User;
import com.spring3.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	@Override
	public void add(User u) {
		this.userDao.sava(u);
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
