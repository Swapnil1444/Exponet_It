package services;

import java.util.Scanner;

import model.Account;

public class Union implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void createAccount() {
		System.out.println("------Create New Account------");
		System.out.print("Enter Account Number:");
		ac.setAccountNumber(sc.nextInt());
		System.out.print("Enter Account Holder Name:");
		ac.setAccountHolderName(sc.next());
		System.out.print("Enter Account Type(Savings or Current):");
		ac.setAccountType(validAccountType(sc.next()));
		//ac.setAccountType(sc.next());
		System.out.print("Enter Moblie Number:");
		ac.setMobileNumber(validContectNumber(sc.next()));
		// ac.setMobileNumber(sc.next());
		System.out.print("Enter Email:");
		ac.setEmail(sc.next());
		System.out.print("Enter Aadhaar Number:");
		ac.setAdarNum(validAdharNum(sc.next()));
		System.out.print("Enetr Pan Card Number:");
		ac.setPanNum(sc.next());
		System.out.print("Enter Address:");
		ac.setAddress(sc.next());

		System.out.println("\nNew Account create successfully...😎\n");

	}

	@Override
	public void displayAccountDetails() {

		if (checkAccountNumber()) {
			System.out.println("\n" + ac + "\n");
		} else {
			System.err.println("Wrong Account Number try again.");
		}
	}

	@Override
	public void checkBalance() {
		if (checkAccountNumber()) {
			System.out.println("\n Account Balance:₹" + ac.getBalance() + ".\n");
		} else {
			System.err.println("Wrong Account Number try again.");
		}

	}

	@Override
	public void deposit() {
		if (checkAccountNumber()) {
			System.out.print("Enter Deposit Amount Minimum 1000:");
			double amount = sc.nextDouble();
			if (amount >= ac.getMinimumBalance()) {
				ac.setBalance(amount + ac.getBalance());
				System.out.print("\nDeposit Amount Successfully..!\n");
			} else {
				System.err.println("Deposit Amount Minimum 1000.");
			}
		} else {
			System.err.println("Wrong Account Number try again.");
		}

	}

	@Override
	public void withdraw() {
		if (checkAccountNumber()) {
			System.out.print("Enter Withdraw Amount Minimum 500:");
			double amount = sc.nextDouble();
			if (amount >= 500) {
				if (amount <= ac.getBalance()) {
					ac.setBalance(ac.getBalance() - amount);
					System.out.println("\nWithdraw Amount Successfully..!\n");
				} else {
					System.err.println("The Balance is Insufficient.");
				}
			} else {
				System.err.println("Withdraw Amount Minimum 500.");
			}
		} else {
			System.err.println("Wrong Account Number try again.");
		}

	}

	@Override
	public void updateAccountInfo() {
		if (checkAccountNumber()) {
			accountUpdateManu();
		} else {
			System.err.println("Wrong Account Number try again.");
		}
	}

	public boolean checkAccountNumber() {
		System.out.println("----------------------------");
		System.out.print("Enter Account Number:");
		int acNo = sc.nextInt();
		System.out.println("----------------------------");
		if (acNo == ac.getAccountNumber()) {
			return true;
		}
		return false;
	}

	public void accountUpdateManu() {
		boolean flag = true;
		while (flag) {
			System.out.println("1.Account Holder Name \n2.Account Type \n3.Mobile Number"
							+ " \n4.Email \n5.Address \n6.Aadhaar Number \n7.Pan Card Number \n8.Back");
			System.out.println("-------------------------");
			System.out.print("Wich Data Update:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter new Account Holder Name:");
				ac.setAccountHolderName(sc.next());
				showUpdateMsg();
				break;
			case 2:
				System.out.print("Enter new Account Type(Savings or Current):");
				ac.setAccountType(validAccountType(sc.next()));
				showUpdateMsg();
				break;
			case 3:
				System.out.print("Enter new Mobile Number:");
				ac.setMobileNumber(validContectNumber(sc.next()));
				showUpdateMsg();
				break;
			case 4:
				System.out.print("Enter new Email:");
				ac.setEmail(sc.next());
				showUpdateMsg();
				break;
			case 5:
				System.out.print("Enter new Address:");
				ac.setAddress(sc.next());
				showUpdateMsg();
				break;
			case 6:
				System.out.print("Enter new Aadhaar Number:");
				ac.setAdarNum(validAdharNum(sc.next()));
				showUpdateMsg();
				break;
			case 7:
				System.out.println("Enter new Pan card Number:");
				ac.setPanNum(sc.next());
				showUpdateMsg();
				break;
			case 8:
				flag = false;
				break;
			default:
				System.err.println("Invalid Input..!");
				break;
			}
			System.out.println("-----------------------");
		}
	}

	public void showUpdateMsg() {
		System.out.println("\nUpdate Data Successfully...!\n");
	}

	public String validContectNumber(String num) {
		if (10 == num.length()) {
			return num;
		}
		System.err.println("Invalid Contect Number.");
		System.out.print("ReEnter 10 digit Contect Number:");
		return validContectNumber(sc.next());

	}

	public String validAccountType(String accType) {
		if ("Savings".equalsIgnoreCase(accType) || "Current".equalsIgnoreCase(accType)) {
			return accType;
		}
		System.err.println("Invalid Account Type.");
		System.out.print("ReEnter Account Type(Savings or Current) :");
		return validAccountType(sc.next());
	}
	public String validAdharNum(String num) {
		if(num.length()==12) {
			return num;
		}
		System.err.println("Invalid Aadhar Number");
		System.out.print("ReEnter 12 digit Aadhar Card Number:");
		return validAdharNum(sc.next());
	}

}
