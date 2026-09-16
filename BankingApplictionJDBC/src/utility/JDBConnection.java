package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBConnection {

	private static Connection con = null;

	private JDBConnection() {
	}

	public static Connection getConnections() {

		if (con == null) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
				String user = "root";
				String password = "9309";
				String url = "jdbc:mysql://localhost:3306/bankingApplection";
				con = DriverManager.getConnection(url, user, password);
				return con;

			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		}
		return con;
	}

}
