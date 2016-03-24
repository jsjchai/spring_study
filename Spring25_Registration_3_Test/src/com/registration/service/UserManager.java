package com.registration.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.registration.model.User;
import com.registration.util.HibernateUtil;

public class UserManager {


	public boolean exists(User u)  {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		
		Query q=s.createQuery("select count(*) from User u where u.username=?");
		q.setString(0,u.getUsername());
		long count = (Long) q.uniqueResult();
		if(count>0){
			return true;
		}
		s.getTransaction().commit();
		return false;
	}

	public void add(User u)  {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
	}
}
