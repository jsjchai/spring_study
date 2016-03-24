package com.service;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("beans.xml");
		UserService us=(UserService)cpx.getBean("userService");
		//UserService us1=(UserService)bf.getBean("userService");
		//System.out.println(us==us1);
		//us.add(new User());
		
		cpx.close();
	}

}
