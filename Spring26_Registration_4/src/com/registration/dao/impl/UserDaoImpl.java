package com.registration.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.registration.dao.UserDao;
import com.registration.model.User;
import com.registration.util.HibernateUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public void save(User u) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
	}

	@Override
	public boolean checkUserExistsWithName(String username) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
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
