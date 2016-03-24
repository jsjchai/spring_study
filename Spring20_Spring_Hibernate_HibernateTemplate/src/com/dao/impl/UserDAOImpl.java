package com.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.dao.UserDAO;
import com.model.User;

@Component("userDAOImpl")
public class UserDAOImpl implements UserDAO {

	private HibernateTemplate hibernateTemplate;

	public void save(User u) {
		System.out.println("hibernateTemplate class:"+ hibernateTemplate.getClass());
		/*
		Session s= sessionFactory.getCurrentSession();
		s.save(u);*/
		hibernateTemplate.save(u);
		System.out.println("user saved");
	}

	public HibernateTemplate getSessionFactory() {
		return hibernateTemplate;
	}

	@Resource
	public void setSessionFactory(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
}
