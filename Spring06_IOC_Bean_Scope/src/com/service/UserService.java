package com.service;

import com.dao.UserDAO;
import com.model.User;

public class UserService {

	private UserDAO userdio;

	public UserDAO getUserdio() {
		return userdio;
	}

	public void setUserdio(UserDAO userdio) {
		this.userdio = userdio;
	}

	public void add(User u) {
		this.userdio.save(u);
	}
}
