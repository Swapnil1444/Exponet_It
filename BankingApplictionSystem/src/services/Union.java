package services;

import java.io.IOException;
import java.util.Scanner;

import fileOperation.FileOperation;
import model.Account;
import model.Validetions;

public class Union implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void createAccount() throws IOException  {
		System.out.println("=======================================");
		System.out.println("          Create New Account           ");
		System.out.println("=======================================");

//		System.out.print("Enter Account Number:");
		ac.setAccountNumber((long)(Math.random()*Math.pow(10, 12)));
		//System.out.print("Enter Account Holder Name:");
		ac.setAccountHolderName(Validetions.validName());
//		sc.next();
		System.out.print("Enter Account Type(Savings or Current):");
		ac.setAccountType(validAccountType(sc.next()));
		//ac.setAccountType(sc.next());
		sc.nextLine();
		System.out.print(" ");
		//sc.nextLine();
		ac.setMobileNumber( (Validetions.validContectNo()));
		
//		System.out.print("Enter Email:");
		ac.setEmail(Validetions.validEmail());
	//	System.out.print("Enter Aadhaar Number:");
		ac.setAdarNum(Validetions.validAdharNo());
		/* System.out.print("Enetr Pan Card Number:"); */
		ac.setPanNum(Validetions.validPanNo());
		System.out.print("Enter Address:");
		ac.setAddress(sc.next());
		System.out.print("Deposit Amount:");
		ac.setBalance(checkDeposit(sc.nextDouble()));
		System.out.println("=======================================");
		sc.nextLine();
		FileOperation.saveAccount(ac);		
	}

	@Override
	public void displayAccountDetails() {

		if (checkAccountNumber()) {
			ac.displayAccDetails();
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

	public double checkDeposit(double amount) {
		if(amount>=0) {
			return amount;
		}
		System.err.println("Error:Negative value..!");
		System.out.print("ReEnter Deposit Amount:");
		return checkDeposit(sc.nextDouble());
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
	//	System.out.println("=======================================");

		System.out.println("---------------------------------------");
		System.out.print("Enter Account Number:");
		long acNo = sc.nextLong();
		System.out.println("---------------------------------------");
		if (acNo == ac.getAccountNumber()) {
			return true;
		}
		return false;
	}

	public void accountUpdateManu() {
		boolean flag = true;
		while (flag) {
			System.out.println("=======================================");
			System.out.println("       Update Account Information      ");
			System.out.println("=======================================");
			System.out.println("1.Account Holder Name \n2.Account Type \n3.Mobile Number"
							+ " \n4.Email \n5.Address  \n6.Back");
			System.out.println("=======================================");

			System.out.print("Select Option:");
			int ch = sc.nextInt();
			System.out.println("---------------------------------------");
			switch (ch) {
			case 1:
				//System.out.print("Enter new Account Holder Name:");
				ac.setAccountHolderName(Validetions.validName());
				showUpdateMsg();
				break;
			case 2:
				System.out.print("Enter new Account Type(Savings or Current):");
				ac.setAccountType(validAccountType(sc.next()));
				showUpdateMsg();
				break;
			case 3:
				//System.out.print("Enter new Mobile Number:");
				ac.setMobileNumber(Validetions.validContectNo());
				showUpdateMsg();
				break;
			case 4:
				//System.out.print("Enter new Email:");
				ac.setEmail(Validetions.validEmail());
				showUpdateMsg();
				break;
			case 5:
				System.out.print("Enter new Address:");
				ac.setAddress(sc.next());
				showUpdateMsg();
				break;
//			case 6:
//				System.out.print("Enter new Aadhaar Number:");
//				ac.setAdarNum(validAdharNum(sc.next()));
//				showUpdateMsg();
//				break;
//			case 7:
//				System.out.println("Enter new Pan card Number:");
//				ac.setPanNum(sc.next());
//				showUpdateMsg();
//				break;
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

//	public String validContectNumber(String num) {
//		if (10 == num.length()) {
//			if(!(num.equals(ac.getMobileNumber()))){
//				return num;
//			}else {
//				System.err.println("Same Contect Number..!");
//				System.out.print("ReEnter 10 digit Contect Number:");
//				return validContectNumber(sc.next());
//			}
//		}
//		System.err.println("Invalid Contect Number.");
//		System.out.print("ReEnter 10 digit Contect Number:");
//		return validContectNumber(sc.next());
//
//	}
	public long validContectNumber(long num) {
		if ((1000000000<=num&&9999999999l>=num)) {
			if(!(num==ac.getMobileNumber())){
				return num;
			}else {
				System.err.println("Same Contect Number..!");
				System.out.print("ReEnter 10 digit Contect Number:");
				return validContectNumber(sc.nextLong());
			}
		}
		System.err.println("Invalid Contect Number.");
		System.out.print("ReEnter 10 digit Contect Number:");
		return validContectNumber(sc.nextLong());

	}

	public String validAccountType(String accType) {
		if ("Savings".equalsIgnoreCase(accType) || "Current".equalsIgnoreCase(accType)) {
			return accType.toUpperCase();
		}
		System.err.println("Invalid Account Type.");
		System.out.print("ReEnter Account Type(Savings or Current) :");
		return validAccountType(sc.next());
	}
	
	//check adhar frist 4 digit not 0-1 
	public boolean adhar(String adharNum){
		for(int i=0;i<adharNum.length();i++) {
			char ch=adharNum.charAt(i);
			if(ch<'0'||ch>'9') { // Check each character is a digit
				return false;
			}
			if(i==0&&(ch=='0'||ch=='1')) { // Check first digit
				return false;
			}
		}
		return true;
	}
	
	public String validAdharNum(String num) {
		if(num==null||num.length()==12) {
			if(adhar(num)) {
				return num;
			}else {
				System.err.println("Aadhaar should not start with 0 or 1");
				System.out.print("ReEnter 12 digit Aadhar Card Number:");
				return validAdharNum(sc.next());
			}
			//return num;
		}
		System.err.println("Invalid Aadhar Number");
		System.out.print("ReEnter 12 digit Aadhar Card Number:");
		return validAdharNum(sc.next());
	}
}
