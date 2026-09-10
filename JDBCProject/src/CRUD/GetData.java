package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetData {

	public static void main(String[] args) {

		getData();
	}

	public static void getData() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");

			Statement stm = con.createStatement();

			String sql = "select * from emp";

			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				System.out.println("Id:" + rs.getInt("id") + " name:" + rs.getString("name") + " age:"
						+ rs.getInt("age") + " salary:" + rs.getInt("salary"));
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
