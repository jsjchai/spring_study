package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.dao.UserDAO;
import com.model.User;

@Component("userService")
//@Scope("prototype")
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
	
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}
}
