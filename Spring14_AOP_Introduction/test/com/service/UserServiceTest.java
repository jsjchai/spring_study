package com.service;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.aop.LogInterceptor;
import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;
import com.spring.simulation.BeanFactory;
import com.spring.simulation.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		BeanFactory bf=new ClassPathXmlApplicationContext();
		UserService service =(UserService) bf.getBean("userService");
//		UserDAO udo=(UserDAO) bf.getBean("u");
//		service.setUserdio(udo);
		User u=new User();
		service.add(u);
	}

	@Test
	public void testProxy() {
		UserDAO userDAO = new UserDAOImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userDAO);
		//UserDAO userDAOProxy = (UserDAO)Proxy.newProxyInstance(userDAO.getClass().getClassLoader(), userDAO.getClass().getInterfaces(), li);
		UserDAO userDAOProxy = (UserDAO)Proxy.newProxyInstance(userDAO.getClass().getClassLoader(),new Class[]{UserDAO.class} , li);
		System.out.println(userDAOProxy.getClass());
		userDAOProxy.delete();
		userDAOProxy.save(new User());
		
	}
	
	/*class $Proxy2 implements UserDAO 
	 * {
	 * 	save(User u) {
	 * 	Method m = UserDAO.getclass.getmethod 
	 * li.invoke(this, m, u)
	 * }
	 * }
	 */
}
