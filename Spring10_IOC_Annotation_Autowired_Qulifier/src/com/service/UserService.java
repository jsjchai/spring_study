package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.dao.UserDAO;
import com.model.User;

public class UserService {

	private UserDAO userdio;

	public UserDAO getUserdio() {
		return userdio;
	}

	@Autowired
	public void setUserdio(@Qualifier("u") UserDAO userdio) {
		this.userdio = userdio;
	}

	public void add(User u) {
		this.userdio.save(u);
	}
}
