package com.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.dao.LogDAO;
import com.model.Log;

//@Component("logdao")
public class LogDAOImpl extends HibernateDaoSupport implements LogDAO {

	@Override
	public void save(Log log) {
		this.getHibernateTemplate().save(log);
		
		//throw new RuntimeException("exception!");
	}

}
