package com.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.dao.LogDAO;
import com.model.Log;

@Component("logdao")
public class LogDAOImpl implements LogDAO {

	private SessionFactory sessionFactory;

	@Override
	public void save(Log log) {
		Session s = sessionFactory.getCurrentSession();
		s.save(log);
		//throw new RuntimeException("exception!");
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
