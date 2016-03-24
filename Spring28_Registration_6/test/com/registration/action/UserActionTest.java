package com.registration.action;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserActionTest {

	@Test
	public void testExecute() throws Exception {
		UserAction uac=new UserAction();
		uac.setUsername("p");
		uac.setPassword("p");
		String result=uac.execute();
		assertEquals("success", result);
	}

}
