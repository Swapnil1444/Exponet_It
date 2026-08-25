package Controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import Services.UserServices;
import Services.UserServicesImpl;

public class UserController {

	public static void main(String[] args) {
		MainManu();

	}

	public static void MainManu() {
		boolean fang = true;
		Scanner sc = new Scanner(System.in);
		UserServices us = new UserServicesImpl();
		while (fang) {
			System.out.println("==============================================================================");
			System.out.println("                            USER MANGEMENT SYSTEM                             ");
			System.out.println("==============================================================================");

			System.out.println("1.Create User \n2.Display User \n3.Update User \n4.Delete User \n5.Exit");
			System.out.println("------------------------------------------------------------------------------");
			System.out.print("Select Option:");
			try {
				int ch = sc.nextInt();
				System.out.println("------------------------------------------------------------------------------");
				switch (ch) {
				case 1:
					us.createUser();
					break;
				case 2:
					us.displayUserInfo();
					break;
				case 3:
					us.updateUserInfo();
					break;
				case 4:
					us.deleteUserInfo();
					break;
				case 5:
					System.out.println("Exit...!");
					fang = false;
					break;
				default:
					System.err.println("Invalid Input...!");
					break;

				}

			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Invalid Input:" + e);

			}

		}

	}

}
