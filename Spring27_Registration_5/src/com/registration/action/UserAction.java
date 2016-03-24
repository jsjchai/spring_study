package com.registration.action;

import com.opensymphony.xwork2.ActionSupport;
import com.registration.model.User;
import com.registration.service.UserManager;
import com.registration.service.impl.UserManagerImpl;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
	
	private String username;
	private String password;
	
	UserManager um=new UserManagerImpl();
	@Override
	public String execute() throws Exception {
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		
		if(um.exists(u)){
			return "fail";
		}
		um.add(u);
		return "success";
	}
	public UserManager getUm() {
		return um;
	}
	public void setUm(UserManager um) {
		this.um = um;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
