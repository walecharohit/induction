package com.fnp.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * This class is used to estabilish a Connection to the MySql Database. It
 * returns a Connection object.
 * 
 * @author Saransh vijay
 * @category Database Connection class.
 * 
 */
public class DBConnect {

	public static Connection c = null;

	public Connection establishConnection() {
		PropertyReader.fileRead();
		if (c != null) {
			return c;
		}
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
