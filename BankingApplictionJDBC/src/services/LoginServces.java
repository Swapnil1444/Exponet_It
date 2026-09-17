package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import controller.AdminController;
import model.Admin;
import utility.JDBConnection;

public class LoginServces {

	Admin a = new Admin();
	Scanner sc = new Scanner(System.in);

	public void AdminLogin() {
		boolean flag=true;
		System.out.print("Enter UserId:");
		a.setUserId(sc.next());
		System.out.print("Enter Password:");
		a.setPassword(sc.next());

		String seletadmin = "select * from admins where userId=? ";
		Connection com = JDBConnection.getConnections();

		try {
			PreparedStatement ps = com.prepareStatement(seletadmin);
			ps.setString(1, a.getUserId());
		//	ps.setString(2, a.getPassword());

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				flag=false;
				if(rs.getString("userId").equals(a.getUserId())) {
					if(rs.getString("password").equals(a.getPassword())) {
						
						AdminController.mainMenu(rs.getString("userName"));
					}else {
						System.err.println("Password not match");
					}
				}
			}
			if(flag) {
				System.err.println("Admin Not Exating..!");
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}
	
	public void UserLogin() {
		System.out.println("User logging coming soon...!");
	}

}
