package com.spring3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring3.dao.UserDao;
import com.spring3.dao.impl.UserDaoImpl;
import com.spring3.service.UserService;
import com.spring3.service.impl.UserServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public UserDao userDao(){
		return new UserDaoImpl();
	}
	

	@Bean
	public UserService userService() {
		UserServiceImpl service = new UserServiceImpl();
		service.setUserDao(userDao());
		return service;
	}
}
