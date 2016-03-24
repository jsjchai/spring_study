/*
 * 	1、首先struts2 根据class问spring要bean 如果找到直接使用 
	2、如果找不到 struts2 new一个 然后调用spring的autowire相关方法注入数据 
	3、如果你开启了注解支持 那么也能注入
 */
package com.registration.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.registration.dto.UserRegisterInfo;
import com.registration.model.User;
import com.registration.service.UserManager;


@Component("userAction") //可去除，但只在web的情况下   test有问题
//@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven{
	
	
	private UserRegisterInfo info=new UserRegisterInfo();
	private List<User> users;
	private User user;
	UserManager userManger;
	
	public UserAction(){
		System.out.println("userAction");
	}
	@Override
	public String execute() throws Exception {
		User u=new User();
		u.setUsername(info.getUsername());
		u.setPassword(info.getPassword());
		if(userManger.exists(u)){
			return "fail";
		}
		userManger.add(u);
		return "success";
	}
	
	public String list(){
		this.users = this.userManger.list();
		return "list";
	}
	public String load(){
		this.user=this.userManger.loadById(info.getId());
		return "load";
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

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserManager getUserManger() {
		return userManger;
	}
	@Resource(name="userManager")
	public void setUserManger(UserManager userManger) {
		this.userManger = userManger;
	}

	
	
}
