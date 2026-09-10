package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) {
		
		insertData();
	}
	
	public static void insertData() {
		
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");

			Statement stm = con.createStatement();

			String sql = "insert into emp values(101 ,'swapnil',21 ,200000)";
			if (!stm.execute(sql)) {
				System.out.println("insert data ...!");
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

}
