package com.ps;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	public static Connection con = null;

	private MyConnection() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnections() {
		if (con == null) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");
				return con;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return con;
	}

}  