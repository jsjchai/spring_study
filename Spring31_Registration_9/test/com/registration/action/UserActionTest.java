package com.registration.action;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.registration.dto.UserRegisterInfo;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception {
		//springû��ע��
		UserAction ua = new UserAction();
		UserRegisterInfo info = new UserRegisterInfo();
		info.setUsername("x");
		info.setPassword("x");
		ua.setInfo(info);
		String ret = ua.execute();
		assertEquals("success", ret);
	}

	@Test
	public void testList() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		UserAction ua = (UserAction)ctx.getBean("userAction");
		System.out.println(ua.getClass());
		ua.list();
		Assert.assertTrue(ua.getUsers().size() > 0);
	}
}
