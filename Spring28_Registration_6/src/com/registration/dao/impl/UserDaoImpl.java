package com.registration.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.registration.dao.UserDao;
import com.registration.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(User u) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
	}

	@Override
	public boolean checkUserExistsWithName(String username) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		
		
		// Query q=s.createQuery("select count(*) from User u where u.username=?");
		long count = (long) s
				.createQuery(
						"select count(*) from User u where u.username=:name")
				.setString("name", username).uniqueResult();
		if (count > 0) {
			return true;
		}
		s.getTransaction().commit();
		return false;
	}

}
