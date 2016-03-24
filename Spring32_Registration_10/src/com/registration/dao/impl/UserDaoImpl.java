package com.registration.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.registration.dao.UserDao;
import com.registration.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate; 
	public void save(User u) {
		hibernateTemplate.save(u);
		
	}

	public boolean checkUserExistsWithName(String username) {
		List<User> users = (List<User>) hibernateTemplate.find("from User u where u.username = '" + username + "'");
		
		
		if(users != null && users.size() > 0) {
			return true;
		}
		return false;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List<User> getUsers() {
		return (List<User>)hibernateTemplate.find("from User");
	}

	@Override
	public User loadById(int id) {
		//one2many many2many 关联对象-->lazy
		return hibernateTemplate.get(User.class, id);
		//return hibernateTemplate.load(User.class, id);
	}

}
