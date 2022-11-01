package com.fnp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	Connection c;

	public Connection establishConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");
			System.out.println("Database Connection Established.");
			c = connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
}
