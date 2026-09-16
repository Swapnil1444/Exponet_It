package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import Model.Constant;
import Model.MyConnection;
import Model.User;
import Validations.UserValidation;

public class UserServicesJDBC implements UserServices {

	Scanner sc = new Scanner(System.in);

	@Override
	public void createUser() {

		System.out.print("How to Add No Users:");
		int size = 0;
		try {
			size = sc.nextInt();

//			if (size > Constant.MaxSize) {
//				throw new ArrayIndexOutOfBoundsException("Maximum users allowed " + Constant.MaxSize);
//			}

			for (int i = 0; i < size; i++) {

				User u = new User();
				System.out.println("----- Add " + (i + 1) + " User -----");
				u.setId(UserValidation.validId());
				u.setName(UserValidation.validName());
				u.setMobileNo(UserValidation.validContectNo());
				u.setEmail(UserValidation.validEmail());
				u.setPanCard(UserValidation.validPanNo());
				System.out.print("Enter Address:");
				u.setAddress(sc.next());
				// System.out.println(u);

				try {

					Connection con = MyConnection.getConnections();
					String insertUser = "insert into User values(?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(insertUser);
					ps.setInt(1, u.getId());
					ps.setString(2, u.getName());
					ps.setString(3, u.getAddress());
					ps.setLong(4, Long.parseLong(u.getMobileNo()));
					ps.setString(5, u.getPanCard());
					ps.setString(6, u.getEmail());
					if (!ps.execute()) {
						System.out.println("Inesrt Data ");
					}

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("\n" + (i + 1) + ".Add User Successfully...1\n ");
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter a number");
			sc.nextLine();
			createUser();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			sc.nextLine();
			createUser();
		}
	}

	@Override
	public void displayUserInfo() {
		try {
			Connection con = MyConnection.getConnections();
			String getUsers = "select * from User";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(getUsers);
			System.out.println("------------------------------------------------------------------------------");
			System.out.printf("%-10s %-10s %-10s  %-10s %-10s %-10s%n", "User Id", "User Name", "Address", "Moblie No",
					"Email", "PanCard");
			System.out.println("------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", rs.getInt("id"), rs.getString("name"),
						rs.getString("address"), rs.getLong("moblieNo"), rs.getString("email"),
						rs.getString("panCard"));
				// System.out.println(rs.getInt("id"));
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	@Override
	public void updateUserInfo() {

		int id = checkUser();
		try {
			if (id != 0) {
				updatedata(id);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void updatedata(int id) {
		Connection con = MyConnection.getConnections();
		int ch = 0;
		boolean f = true;
		while (f) {
			System.out.println("------------------------------------------------------------------------------");

			System.out.println("==============================================================================");
			System.out.println("                            UPADATE USER INFORMTION                         ");
			System.out.println("===============================================================================");

			System.out.println(
					"1.User Name \n2.User Id \n3.User Contect NO \n4.User Email \n5.User PanCard \n6.User Address \n7.Back");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("Select Option:");
			try {
				ch = sc.nextInt();
				System.out.println("------------------------------------------------------------------------------");

			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please enter a number");
				sc.nextLine();

			}

			switch (ch) {
			case 1:
				String name=UserValidation.validName();
				setUserUpdate(id,name,"name");
				break;

			case 2:
				try {
					if (id != 0) {
						int newid=UserValidation.validId();
						String updateQuery="update user set id=? where id=? ";
						PreparedStatement ps=con.prepareStatement(updateQuery);
						//ps.setString(1, update);
						ps.setInt(1, newid);
						ps.setInt(2, id);
						if(!ps.execute()){
							System.out.println("Update Successfully");
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					if (id != 0) {
						String no=UserValidation.validContectNo();
						String updateQuery="update user set moblieNo=? where id=? ";
						PreparedStatement ps=con.prepareStatement(updateQuery);
						//ps.setString(1, update);
						ps.setLong(1, Long.parseLong(no));
						ps.setInt(2, id);
						if(!ps.execute()){
							System.out.println("Update Successfully");
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				String email=UserValidation.validEmail();
				setUserUpdate(id, email,"email");
				break;
			case 5:
				String pan=UserValidation.validPanNo();
				setUserUpdate(id, pan,"panCard");
				break;
			case 6:
				System.out.print("Enter Address:");
				String address=sc.next();
				setUserUpdate(id, address,"address");
				break;

			case 7:
				f = false;
				break;

			default:
				System.err.println("Invalid Input..!");
			}
		}

	}

	@Override
	public void deleteUserInfo() {
		Connection con = MyConnection.getConnections();
		int id = checkUser();
		if (id != 0) {
			String deleteUser = "delete from user where id=?";
			PreparedStatement ps1;
			try {
				ps1 = con.prepareStatement(deleteUser);
				ps1.setInt(1, id);
				if (!ps1.execute()) {
					System.out.println(id + " Delete User...!");
				}
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}

	}

	public static int checkUser() {
		try {
			boolean flag = true;
			Connection con = MyConnection.getConnections();
			String checkUser = "select * from User where id=?";
			PreparedStatement ps = con.prepareStatement(checkUser);
			System.out.println("------------------------------------------------------------------------------");
			int id = UserValidation.validId();
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (id == rs.getInt("id")) {
					flag = false;
					return id;
				}
			}
			if (flag) {
				System.out.println(id + " this user not exting..!");
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return 0;

	}
	
	public void setUserUpdate(int id,String upValue,String update) {
		Connection con = MyConnection.getConnections();
		try {
			if (id != 0) {
				String updateQuery="update user set "+update+"=? where id=? ";
				PreparedStatement ps=con.prepareStatement(updateQuery);
				//ps.setString(1, update);
				ps.setString(1, upValue);
				ps.setInt(2, id);
				if(!ps.execute()){
					System.out.println("Update Successfully");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
