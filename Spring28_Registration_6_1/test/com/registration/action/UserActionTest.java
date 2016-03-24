package com.registration.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception {
		UserAction uac=new UserAction();
		uac.setUsername("p1");
		uac.setPassword("p1");
		String result=uac.execute();
		assertEquals("success", result);
	}

}
