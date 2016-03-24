package com.aop;

public class LogInterceptor {

	public void before() {
		System.out.println("method before");
	}

	public void afterReturning() {
		System.out.println("method after returning");
	}

	public void afterThrowing() {
		System.out.println("exception!");
	}

	public void around() throws Throwable {
		// start stopwatch
		System.out.println("aroud Method start");
		// stop stopwatch
		System.out.println("aroud Method end");
	}
	/*
	 * @Before(
	 * "execution(public void com.dao.impl.UserDAOImpl.save(com.model.User))")
	 * public void before(){ System.out.println("method before"); }
	 */
	/*
	 * @Before("execution(public * com.dao.impl..*.*(..))") public void
	 * before(){ System.out.println("method before"); }
	 * 
	 * @AfterReturning("execution(public * com.dao.impl..*.*(..))") public void
	 * afterReturning(){ System.out.println("method after returning"); }
	 */
}
