package com.registration.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.registration.dto.UserRegisterInfo;
import com.registration.model.User;
import com.registration.service.UserManager;


@Component
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven{
	
	
	private UserRegisterInfo info=new UserRegisterInfo();
	UserManager um;
	
	@Override
	public String execute() throws Exception {
		User u=new User();
		u.setUsername(info.getUsername());
		u.setPassword(info.getPassword());
		if(um.exists(u)){
			return "fail";
		}
		um.add(u);
		return "success";
	}
	public UserManager getUm() {
		return um;
	}
	@Resource(name="userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}
	public UserRegisterInfo getInfo() {
		return info;
	}
	public void setInfo(UserRegisterInfo info) {
		this.info = info;
	}
	@Override
	public Object getModel() {
		return info;
	}

	
}
