package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
		//ordar ,prodect ,user

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");
			String s = "insert into student values(106,'raj',19)";

			Statement smt = connection.createStatement();
			if (!smt.execute(s)) {
				System.out.println("add Data");
			} else {
				System.out.println("No add data");
			}

			connection.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
