package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpeCRUD_Opertion {

	public static Connection getConnections() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");
			return con;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public static void main(String[] args) {

		System.out.println("Class management System");
		//createTable();
      //  addCourse();
        getCourse();
		System.out.println("end");
	}

	public static void createTable() {

		try {
			Connection con = getConnections();
			String crateTable = "create table Course(cid int ,cname varchar(30))";
			Statement stm = con.createStatement();
			if (!stm.execute(crateTable)) {

				System.out.println("create table..!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void addCourse() {
		try {
			Connection con = getConnections();
			String insertCourse = "insert into Course values(3,'html')";
			Statement stm = con.createStatement();
			if (!stm.execute(insertCourse)) {

				System.out.println("insert Course..!");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void getCourse() {
		
		try {
			Connection con = getConnections();
			Statement stm = con.createStatement();
			String getCourse = "select * from Course";
			ResultSet rs= stm.executeQuery(getCourse);
			
			while(rs.next()) {
				System.out.println("-------------------------------------");
				System.out.println(" Course Id:"+rs.getInt("cid")+" Name:"+rs.getString("cname"));
			}
			
			System.out.println("-------------------------------------");
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}
