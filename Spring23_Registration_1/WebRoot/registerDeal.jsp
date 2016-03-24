<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="gb2312"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>registerDeal</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
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
    	
    	try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","527007690");
	    	Statement stat=conn.createStatement();
	    	String sql="insert into User values(null,'"+username+"','"+password+"')";
	    	stat.executeUpdate(sql);
	    	stat.close();
	    	conn.close();
	    	response.sendRedirect("registerSuccess.jsp");
    	}catch(Exception e){
    		response.sendRedirect("registerFail.jsp");
    		e.printStackTrace();
    	}

    %>
  </body>
</html>
