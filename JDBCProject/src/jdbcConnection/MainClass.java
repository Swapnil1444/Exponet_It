package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Project.User;

public class MainClass {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");

			User u = new User();
			u.setId(101);
			u.setName("swapnil");

			Statement stm = con.createStatement();

			System.out.println("-------------------------");
			String crateTable = "create table User(id int ,name varchar(30))";
			if (!stm.execute(crateTable)) {
				System.out.println("create Table");
			}
			
			System.out.println("-------------------------");
			String user = "insert into User values(" + u.getId() + "," + "'" + u.getName() + "'" + ")";
			if (!stm.execute(user)) {
				System.out.println("Insert Deta");
			}
			
			System.out.println("-------------------------");
			String getdata = "select * from User";

			ResultSet rs = stm.executeQuery(getdata);
			System.out.println("Table data:");
			while (rs.next()) {
				System.out.println(" Id:" + rs.getInt("id") + " Name:" + rs.getString("name"));
			}
			
			System.out.println("-------------------------");
			String deleteTable = "drop table User";

			if (!stm.execute(deleteTable)) {
				System.out.println("delete User Table");
			}

			con.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
