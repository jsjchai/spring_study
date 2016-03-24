<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="gb2312"%>
<%@page
	import="com.registration.model.User,com.registration.service.UserManger"%>



<%
    	String username=request.getParameter("username");
    	String password=request.getParameter("password");
    	if(username==null&&username.trim().equals("")){
    		response.sendRedirect("registerFail.jsp");
    		return;
    	}
    	if(password==null&&password.trim().equals("")){
    		response.sendRedirect("registerFail.jsp");
    		return;
    	}
    	
    	User u=new User();
    	u.setUsername(username);
    	u.setPassword(password);
    	
    	UserManger um=new UserManger();
    	if(um.exists(u)){
    		response.sendRedirect("registerFail.jsp");
    		return;
    	}
    	
    	try{
	    	um.add(u);
	    	response.sendRedirect("registerSuccess.jsp");
    	}catch(Exception e){
    		response.sendRedirect("registerFail.jsp");
    		e.printStackTrace();
    	}

 %>

