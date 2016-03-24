package com.registration.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.registration.model.User;

public class UserManger {

	public SessionFactory getSessionFactory(){
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}

	public boolean exists(User u)  {
		SessionFactory sf = this.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		
		Query q=s.createQuery("select count(*) from User u where u.username=?");
		q.setString(0,u.getUsername());
		long count = (Long) q.uniqueResult();
		if(count>0){
			return true;
		}
		s.getTransaction().commit();
		sf.close();
		return false;
	}

	public void add(User u)  {
		SessionFactory sf = this.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		sf.close();
	}
}
