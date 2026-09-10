package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
            
		crateTabel();
	}

	public static void crateTabel() {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");

			Statement stm = con.createStatement();

			String sql = "create table Emp(id int ,name varchar(30),age int ,salary int)";
			if (!stm.execute(sql)) {
				System.out.println("crate table ...!");
			}

			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
