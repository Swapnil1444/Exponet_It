package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		
		deleteRecord();

	}
	
	public static void deleteRecord() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");

			Statement stm = con.createStatement();

			String sql = "delete from emp where id=101";
			if (!stm.execute(sql)) {
				System.out.println("delete data ...!");
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
