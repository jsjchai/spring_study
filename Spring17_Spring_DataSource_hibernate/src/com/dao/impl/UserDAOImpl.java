package com.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.dao.UserDAO;
import com.model.User;

@Component("userDAOImpl")
public class UserDAOImpl implements UserDAO {

	private SessionFactory sf;

	public void save(User u) {
		System.out.println("SessionFactory class:"+sf.getClass());
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
		System.out.println("user saved");

	}

	public SessionFactory getSf() {
		return sf;
	}

	@Resource
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
}
