package com.ps;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseServies {

	Scanner sc = new Scanner(System.in);

	public void insertCourse() {

		System.out.print("Enter Course Id:");
		int id = sc.nextInt();
		System.out.print("Enter Course Name:");
		String name = sc.next();
		Connection con = MyConnection.getConnections();
		String insertCourse = "insert into Course values(?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(insertCourse);
			ps.setInt(1, id);
			ps.setString(2, name);
			if (!ps.execute()) {
				System.out.println("Insert Data");
			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

	public void updateCourse() {

	}

	public void deleteCourse() {

	}

	public void displayCourse() {

		Connection con = MyConnection.getConnections();
		try {
			Statement st = con.createStatement();
			String getData="select * from Course";
			ResultSet rs=st.executeQuery(getData);
			System.out.println("        Course Deta     ");
			while(rs.next()) { 
				System.out.println("-------------------------------");
				System.out.println("Course Id:"+rs.getInt("cid")+" Name:"+rs.getString("cname"));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
