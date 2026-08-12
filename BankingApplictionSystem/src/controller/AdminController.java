package controller;

import java.io.IOException;
import java.util.Scanner;

import services.RBI;
import services.Union;

public class AdminController {

	public static void main(String[] args) throws IOException {

		boolean flag = true;
		RBI r = new Union();
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("=======================================");
			System.out.println("      WELCOME UNION BANK OF INDIA      ");
			System.out.println("=======================================");

			System.out.println("1.Create Account \n2.Display Account Details " + "\n3.Check Balance \n4.Deposit Amount "
					+ "\n5.Withdraw Amount \n6.Update Account Info" + " \n7.Exit.");
			System.out.println("=======================================");

			System.out.print("Select Option:");
			int key = sc.nextInt();

			switch (key) {
			case 1:
				r.createAccount();
				break;
			case 2:
				r.displayAccountDetails();
				break;
			case 3:
				r.checkBalance();
				break;
			case 4:
				r.deposit();
				break;
			case 5:
				r.withdraw();
				break;
			case 6:
				r.updateAccountInfo();
				break;
			case 7:
				System.out.println("Exit...!");
				flag = false;
				break;
			default:
				System.err.println("Invalid Input..!");
				break;
			}

		}
	}

}
