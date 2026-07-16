package com.sbi;

import java.util.Scanner;

public class Account {

	Scanner sc = new Scanner(System.in);

	// User u=new User();
	public void singIn() {

		System.out.println("*** Create new Account ***");

		System.out.print("Enter User Name:");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.print("Enter Account number:");
		int aNum = sc.nextInt();
		System.out.println();
		
		System.out.print("Enetr Password:");
		String pass = sc.nextLine();
		pass=sc.nextLine();
		System.out.println();
		
		System.out.print("Enetr Balanas:");
		double bal = sc.nextDouble();
		System.out.println();

//		u.setAccountNum(aNum);
//		u.setName(name);
//		u.setBal(bal);
//		u.setPassword(pass);
//		u.displayAccDetails();

		SBI s = new SBI(aNum, pass, name, bal);
		s.mainMenu();
		// return u;

	}

	public void login(int aNum, String pass, String name, double bal) {
//		User u = new User();
		// u.displayAccDetails();
		System.out.println("*** Login Account ***");
		System.out.print("Enetr Account Number:");
		int accNo = sc.nextInt();
		System.out.println();
		
		System.out.print("Enetr Password:");
		String password = sc.nextLine();
		password = sc.nextLine();

		// System.out.println((pass.equals(password)));

		// System.out.println(aNum+" "+pass+" "+password+" acc "+accNo);
		if (accNo == aNum && (pass.equals(password))) {

			loginManu(aNum,pass, name, bal);

		} else {
			System.err.println("Error:Incarect Account number and passwod....!");
			login(aNum, pass, name, bal);
		}

	}

	public void loginManu(int aNo,String pass,String name, double bal) {
//		User u = new User();
		System.out.println();
		System.out.println("*** Welcome " + name + " ***");

		System.out.println("\n 1.Deposit \n 2.Check Balance \n 3.Withdrawal Amount \n 4.Logout");
		System.out.print("Select Option:");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			bal = deposit(bal);
			//System.out.println(bal);
			loginManu(aNo,pass, name, bal);
			break;
		}
		case 2: {
             checkBalance(bal);
             loginManu(aNo,pass, name, bal);
			break;
		}
		case 3: {
			bal=withdrawal(bal);
			loginManu(aNo, pass, name, bal);
			break;
		}
		case 4: {
			System.out.println("Thanks you using Appliction "+name+" ...!");
			SBI s=new SBI(aNo, pass, name, bal);
			s.mainMenu();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

	public double deposit(double bal) {
		System.out.println();
		System.out.print("Enetr Deposit Amount:");
		double dAmount = sc.nextDouble();
		if (0 <= dAmount) {
			bal = bal + dAmount;
		} else {
			System.err.println(" Error:Deposit Amount is 0 less than...!");
			deposit(bal);
		}
		return bal;
	}
	
	public void checkBalance(double bal) {
		System.err.println("Account Carrant Balance:"+bal);
	}
	
	public double withdrawal(double bal) {
		
		System.out.println();
		System.out.print("Enetr Withdrawal Amount:");
		double Amount = sc.nextDouble();
		if(bal>=Amount) {
			bal=bal-Amount;
		}
		else {
			System.err.print("Wornig:Insufficient Balance:"+bal);
			withdrawal(bal);
		}
		//bal=bal-Amount;
		return bal;
	}

}
