package com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.LogDAO;
import com.dao.UserDAO;
import com.model.Log;
import com.model.User;

@Component("userService")
public class UserService {

	private UserDAO userdio;
	private LogDAO logdao;

	public LogDAO getLogdao() {
		return logdao;
	}
	@Resource
	public void setLogdao(LogDAO logdao) {
		this.logdao = logdao;
	}

	public UserDAO getUserdio() {
		return userdio;
	}

	@Resource(name = "userDAOImpl")
	public void setUserdio(UserDAO userdio) {
		this.userdio = userdio;
	}
	
	//@Transactional(propagation=Propagation.REQUIRED)
	public void add(User u) {
		this.userdio.save(u);
		Log log=new Log();
		log.setMsg("a user saved!");
		logdao.save(log);
	}
	public User getUser(){
		return null;
	}
}
