import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class collebleStatament {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "9309");
			
		  CallableStatement call =	con.prepareCall("call getStudentInfo(?)");
		  System.out.print("Enetr Student Id:");
		  call.setInt(1,sc.nextInt());
		  ResultSet rs=call.executeQuery();
			while(rs.next()) {
				System.out.println("Id:"+rs.getInt("id")+" name:"+rs.getString("name")+" age:"+rs.getInt("age")+" city:"+rs.getString("city"));
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
