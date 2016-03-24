package com.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.dao.UserDAO;
import com.model.User;

@Component("userDAOImpl")
public class UserDAOImpl implements UserDAO {

	private DataSource dataSource;

	public void save(User u) {
		try {
			Connection conn=dataSource.getConnection();
			conn.createStatement().executeUpdate("insert into user values(null,'a123')");
			System.out.println("user saved");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public DataSource getDataSource() {
		return dataSource;
	}

	@Resource
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
