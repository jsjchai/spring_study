package com.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Component;

import com.dao.UserDAO;
import com.model.User;

@Component("userService")
public class UserService {

	private UserDAO userdio;

	public UserDAO getUserdio() {
		return userdio;
	}

	@Resource(name = "userDAOImpl")
	public void setUserdio(UserDAO userdio) {
		this.userdio = userdio;
	}

	public void add(User u) {
		this.userdio.save(u);
	}
}
