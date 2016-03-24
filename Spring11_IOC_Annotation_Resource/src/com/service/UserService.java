package com.service;

import javax.annotation.Resource;

import com.dao.UserDAO;
import com.model.User;

public class UserService {

	private UserDAO userdio;

	public UserDAO getUserdio() {
		return userdio;
	}

	@Resource(name="u")
	public void setUserdio( UserDAO userdio) {
		this.userdio = userdio;
	}

	public void add(User u) {
		this.userdio.save(u);
	}
}
