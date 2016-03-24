package com.dao.impl;

import org.springframework.stereotype.Component;

import com.dao.LogDAO;
import com.model.Log;

@Component("logDAO") 
public class LogDAOImpl extends SuperDAO implements LogDAO {

	
	public void save(Log log) {
		
		//this.getHibernateTemplate().save(log);
		this.getHibernateTemplate().save(log);
		//throw new RuntimeException("error!");
	}

}
