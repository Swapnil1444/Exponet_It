package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");

			Statement stm = con.createStatement();

			String sql = "Update emp set name='Jay' where id=101";
			if (0<=stm.executeUpdate(sql)) {
				System.out.println("update data...!");
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
