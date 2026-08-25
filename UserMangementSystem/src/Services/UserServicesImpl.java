package Services;

import java.util.InputMismatchException;
import java.util.Scanner;

import Model.Constant;
import Model.User;
import Validations.UserValidation;

public class UserServicesImpl implements UserServices {

	Scanner sc = new Scanner(System.in);
	User[] addUser = new User[Constant.MaxSize];
	int arrCount = 0;

	@Override
	public void createUser() {

		System.out.print("How to Add No Users:");
		int size = 0;
		try {
			size = sc.nextInt();

			if (size > Constant.MaxSize) {
				throw new ArrayIndexOutOfBoundsException("Maximum users allowed " + Constant.MaxSize);
			}

			for (int i = 0; i < size; i++) {

				User u = new User();
				System.out.println("----- Add " + (i + 1) + " User -----");
				u.setId(ValidExitingUser());
				u.setName(UserValidation.validName());
				u.setMobileNo(UserValidation.validContectNo());
				u.setEmail(UserValidation.validEmail());
				u.setPanCard(UserValidation.validPanNo());
				System.out.print("Enter Address:");
				u.setAddress(sc.next());
				// System.out.println(u);

				addUser[arrCount] = u;
				arrCount++;
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
		boolean userCheck = false;
		int id = UserValidation.validId();
		// int id=0;
		System.out.println("------------------------------------------------------------------------------");
		System.out.printf("%-10s %-10s %-10s  %-10s %-10s %-10s%n", "User Id", "User Name", "Address", "Moblie No",
				"Email", "PanCard");
		System.out.println("------------------------------------------------------------------------------");
		for (User u : addUser) {
			if (u != null && u.getId() == id) {
				System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", u.getId(), u.getName(), u.getAddress(),
						u.getMobileNo(), u.getEmail(), u.getPanCard());

				userCheck = true;
			}
		}
		if (!userCheck) {
			System.err.println("No User Available..!");
		}

	}

	@Override
	public void updateUserInfo() {

		boolean userCheck = true;
		int id = UserValidation.validId();
		System.out.println("------------------------------------------------------------------------------");

		for (User user : addUser) {
			if (user != null && user.getId() == id) {
				userCheck = false;
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
						user.setName(UserValidation.validName());
						System.out.println("Update Successfully");
						break;

					case 2:
						user.setId(ValidExitingUser());
						System.out.println("Update Successfully");
						break;
					case 3:
						user.setMobileNo(UserValidation.validContectNo());
						System.out.println("Update Successfully");
						break;
					case 4:
						user.setEmail(UserValidation.validEmail());
						System.out.println("Update Successfully");
						break;
					case 5:
						user.setPanCard(UserValidation.validPanNo());
						System.out.println("Update Successfully");
						break;
					case 6:
						System.out.print("Enter Address:");
						user.setAddress(sc.next());
						System.out.println("Update Successfully");
						break;

					case 7:
						f = false;
						break;

					default:
						System.err.println("Invalid Input..!");
					}
				}

			}
		}
		if (userCheck) {
			System.err.println("No User Available..!");

		}

	}

	@Override
	public void deleteUserInfo() {
		boolean userCheck = true;
		int id = UserValidation.validId();
		System.out.println("------------------------------------------------------------------------------");

		for (int i = 0; i < addUser.length; i++) {
			if (addUser[i] != null && addUser[i].getId() == id) {
				addUser[i] = null;
				System.out.println("Delete User Successfully");
				userCheck = false;
			}

		}
		if (userCheck) {
			System.err.println("No User Available..!");
		}
	}

	public int ValidExitingUser() {
		int id = UserValidation.validId();
		for (int i = 0; i < addUser.length; i++) {
			if (addUser[i] != null && addUser[i].getId() == id) {
				System.err.println(id + " This User Id Available..!");
				return ValidExitingUser();
			}
		}
		return id;

	}
}
