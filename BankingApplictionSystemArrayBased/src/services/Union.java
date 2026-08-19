package services;

import java.io.IOException;
import java.util.Scanner;

import fileOperation.FileOperation;
import model.Account;
import model.ConstantArraySize;


public class Union implements RBI {

	Scanner sc = new Scanner(System.in);
	Account[] accounts = new Account[ConstantArraySize.maxSize];

	@Override
	public void createAccount() throws IOException {

		try {
			System.out.print("How to Create Num of Account:");
			int num = sc.nextInt();

			for (int i = 0; i < num; i++) {
				Account ac = new Account();
				System.out.println("----Create " + (i + 1) + " Account----");
				ac.setAccountNumber(Validetions.validAccountNo());
				ac.setAccountHolderName(Validetions.validName());
				ac.setAccountType(Validetions.validAccountType());
				ac.setAdarNum(Validetions.validAdharNo());
				ac.setPanNum(Validetions.validPanNo());
				ac.setMobileNumber(Validetions.validContectNo());
				ac.setEmail(Validetions.validEmail());
				sc.nextLine();
				System.out.print("Enter Address:");
				ac.setAddress(sc.nextLine());
				System.out.print("Enter Deposit Amount:");
				ac.setBalance(sc.nextDouble());
				accounts[i] = ac;
				
				FileOperation.saveAccount(ac);

			}
			System.out.println("Accounts create successfully...😎");

		} catch (Exception e) {
			System.err.println("Invalid Input. " + e);
			sc.nextLine();
			createAccount();
		}

	}

	@Override
	public void displayAllAccountDetails() {

		System.out.println("=======================================");
		System.out.println("         Account Information           ");
		System.out.println("=======================================");
		System.out.printf("%-14s %-14s %-9s %-10s %-10s %-10s %-10s %-10s%n", " Account No", "Holder Name", "Type",
				"Aadhar No", "Address", "Balance", "Moblie No","Email");
		System.out.println("------------------------------------------------------------------------------------------------");
		for (Account ac : accounts) {
			if (ac != null) {
				System.out.printf("%-14s %-14s %-6s %-10s %-10s %-10s %-10s %-10s%n", ac.getAccountNumber(),
						ac.getAccountHolderName(), ac.getAccountType(), ac.getAdarNum(), ac.getAddress(),
						ac.getBalance(), ac.getMobileNumber(),ac.getEmail());
			}
		}
		System.out.println("------------------------------------------------------------------------------------------------");
	}

	@Override
	public void checkBalance() {
		long accNo = Validetions.validAccountNo();
		for (Account ac : accounts) {
			if (ac != null) {
				if (ac.getAccountNumber() == accNo) {
					System.out.println("Current Balance:" + ac.getBalance());
				}
			}
		}

	}

	@Override
	public void withdraw() {
		Account ac = checkAccount();
		System.out.print("Withdraw Amount:");
		int amount = sc.nextInt();
		if (amount >= 0) {
			if (ac.getBalance() >= amount) {
				ac.setBalance(ac.getBalance() - amount);
				System.out.println("Withdraw successfully..!");
			} else {
				System.out.println("Insufficient balance..!");
			}
		} else {
			System.out.println("Invalid Amount..!");
		}

	}

	@Override
	public void deposit() {
		Account ac = checkAccount();
		System.out.print("Deposit Amount:");
		int amount = sc.nextInt();
		if (amount >= 0) {
			ac.setBalance(ac.getBalance() + amount);
			System.out.println("Withdraw successfully..!");

		} else {
			System.out.println("Invalid Amount..!");
		}

	}

	public Account checkAccount() {
		int accNo = (int) Validetions.validAccountNo();
		for (Account ac : accounts) {
			if (ac != null) {
				if (ac.getAccountNumber() == accNo) {
					return ac;
				}
			}
		}
		System.err.println("Not Existing this Account ");
		return checkAccount();
	}

	@Override
	public void updateAccountInfo() {
		Account ac = checkAccount();
		boolean flag = true;
		while (flag) {
			System.out.println("=======================================");
			System.out.println("       Update Account Information      ");
			System.out.println("=======================================");
			System.out.println(
					"1.Account Holder Name \n2.Account Type \n3.Mobile Number" + " \n4.Email \n5.Address  \n6.Back");
			System.out.println("=======================================");

			System.out.print("Select Option:");
			int ch = sc.nextInt();
			System.out.println("---------------------------------------");
			switch (ch) {
			case 1:
				ac.setAccountHolderName(Validetions.validName());
				showUpdateMsg();
				break;
			case 2:
				ac.setAccountType(Validetions.validAccountType());
				showUpdateMsg();
				break;
			case 3:
				ac.setMobileNumber(Validetions.validContectNo());
				showUpdateMsg();
				break;
			case 4:
				ac.setEmail(Validetions.validEmail());
				showUpdateMsg();
				break;
			case 5:
				System.out.print("Enter new Address:");
				ac.setAddress(sc.next());
				showUpdateMsg();
				break;
			case 6:
				flag = false;
				break;
			default:
				System.err.println("Invalid Input..!");
				break;
			}
			System.out.println("---------------------------------------");
		}
	}

	public void showUpdateMsg() {
		System.out.println("\nUpdate Data Successfully...!\n");
	}

}
