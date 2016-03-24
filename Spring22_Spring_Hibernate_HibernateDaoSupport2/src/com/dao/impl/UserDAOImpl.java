package com.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.dao.LogDAO;
import com.dao.UserDAO;
import com.model.Log;
import com.model.User;

@Component("u") 
public class UserDAOImpl extends SuperDAO implements UserDAO {

	//new UserDAOImpl( new AbstractDAO

	public void save(User u) {
		
			this.getHibernateTemplate().save(u);
			
		//throw new RuntimeException("exeption!");
	}

	

}
