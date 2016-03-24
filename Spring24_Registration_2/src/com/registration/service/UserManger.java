package com.registration.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.registration.model.User;

public class UserManger {

	public boolean exists(User u) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","527007690");
    	String sql="select count(*) from user where username=?";
    	PreparedStatement ps=conn.prepareStatement(sql);
    	ps.setString(1, u.getUsername());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
        	if(rs.getInt(1)>0)
        		return true;
        }
		return false;
	}
	public void add(User u) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring","root","527007690");
    	String sql="insert into User values(null,?,?)";
    	PreparedStatement ps=conn.prepareStatement(sql);
    	ps.setString(1,u.getUsername());
    	ps.setString(2,u.getPassword());
    	ps.executeUpdate();
    	ps.close();
    	conn.close();
	}
}
