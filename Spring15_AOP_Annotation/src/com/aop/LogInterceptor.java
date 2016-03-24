package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LogInterceptor {
	//@Pointcut("execution(public * com.dao.impl..*.*(..))")
	@Pointcut("execution(public * com.service..*.add(..))")
	public void myMethod(){};
	
	
	@Before("myMethod()")
	public void before(){
		System.out.println("method before");
	}
	
	@AfterReturning("myMethod()")
	public void afterReturning(){
		System.out.println("method after returning");
	}
	@AfterThrowing("myMethod()")
	public void afterThrowing(){
		System.out.println("exception!");
	}
	@Around("myMethod()")
	public void around(ProceedingJoinPoint pjp) throws Throwable{
		 // start stopwatch
		System.out.println("aroud Method start");
        pjp.proceed();
        // stop stopwatch
        System.out.println("aroud Method end");
	}
	/*
	@Before("execution(public void com.dao.impl.UserDAOImpl.save(com.model.User))")
	public void before(){
		System.out.println("method before");
	}*/
	/*
	@Before("execution(public * com.dao.impl..*.*(..))")
	public void before(){
		System.out.println("method before");
	}
	
	@AfterReturning("execution(public * com.dao.impl..*.*(..))")
	public void afterReturning(){
		System.out.println("method after returning");
	}*/
}
