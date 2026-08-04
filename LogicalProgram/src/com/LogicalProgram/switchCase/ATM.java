package com.LogicalProgram.switchCase;

import java.util.Scanner;

public class ATM {

	public static void MainMenu() {

		Scanner sc = new Scanner(System.in);
		System.out.println("===ATM Menu===");
		System.out.println("1.Cash Withdrawals " + "\n2.Balance Inquiries " + "\n3.Cash Deposits "
				+ "\n4.Fund Transfers " + "\n5.PIN Changes " + "\n6.Exit");
		System.out.print("Select Option:");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Cash Withdrawals");
			break;
		case 2:
			System.out.println("Balance Inquiries");
			break;
		case 3:
			System.out.println("Cash Deposits");
			break;
		case 4:
			System.out.println("Fund Transfers");
			break;
		case 5:
			System.out.println("PIN Changes");
			break;
		case 6:
			System.out.println("Exit..!");
			break;
		default:
			System.err.println("Invalid Input.");
			MainMenu();
		}

	}

	public static void main(String[] args) {
		MainMenu();
	}

}
