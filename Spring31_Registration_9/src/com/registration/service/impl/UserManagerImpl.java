package com.registration.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.registration.dao.UserDao;
import com.registration.model.User;
import com.registration.service.UserManager;

@Component("userManager")
public class UserManagerImpl implements UserManager {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	public boolean exists(User u) {
		return userDao.checkUserExistsWithName(u.getUsername());
	}


	public void add(User u) {
		userDao.save(u);
	}

	@Override
	public List<User> list() {
		return this.userDao.getUsers();
	}

	
}
