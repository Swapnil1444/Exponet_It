package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	private static Connection con = null;

	private MyConnection() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnections() {
		if (con == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UserMangSystem", "root", "9309");
				return con;
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return con;
	}

}
