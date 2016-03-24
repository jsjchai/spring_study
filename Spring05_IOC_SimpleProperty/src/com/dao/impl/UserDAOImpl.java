package com.dao.impl;

import com.dao.UserDAO;
import com.model.User;

public class UserDAOImpl implements UserDAO {

	private int daoId;
	private String daoStatus;
	public void save(User u) {
		System.out.println("user saved");
	}
	public int getDaoId() {
		return daoId;
	}
	public void setDaoId(int daoId) {
		this.daoId = daoId;
	}
	public String getDaoStatus() {
		return daoStatus;
	}
	public void setDaoStatus(String daoStatus) {
		this.daoStatus = daoStatus;
	}

	@Override
	public String toString() {
		return this.daoId + ":" + this.daoStatus;
	}

}
