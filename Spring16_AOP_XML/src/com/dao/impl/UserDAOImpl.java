package com.dao.impl;

import org.springframework.stereotype.Component;

import com.dao.UserDAO;
import com.model.User;

@Component("userDAOImpl")
public class UserDAOImpl implements UserDAO {
	
	private int daoId;
	public int getDaoId() {
		return daoId;
	}

	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}

	public void save(User u) {
		System.out.println("user saved");
		//throw new RuntimeException("exception!");
	}
	
	@Override
	public String toString() {
		return "daoId="+daoId;
	}

}
