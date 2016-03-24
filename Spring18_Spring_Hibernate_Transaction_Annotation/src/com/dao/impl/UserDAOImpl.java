package com.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.dao.UserDAO;
import com.model.User;

@Component("userDAOImpl")
public class UserDAOImpl implements UserDAO {

	private SessionFactory sessionFactory;

	public void save(User u) {
		System.out.println("SessionFactory class:"+ sessionFactory.getClass());
		Session s= sessionFactory.getCurrentSession();
		s.save(u);
		System.out.println("user saved");
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
