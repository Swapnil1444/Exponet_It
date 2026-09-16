package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.Account;
import utility.*;

public class Union implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void createAccount() {

		System.out.println("=======================================");
		System.out.println("          Create New Account           ");
		System.out.println("=======================================");

		ac.setAccountNumber((long) (Math.random() * Math.pow(10, 12)));
		ac.setAccountHolderName(Validations.validName());
		ac.setAccountType(Validations.validAccountType());
		ac.setMobileNumber(Validations.validContectNo());
		ac.setEmail(Validations.validEmail());
		ac.setAdarNum(Validations.validAdharNo());
		ac.setPanNum(Validations.validPanNo());
		System.out.print("Enter Address:");
		ac.setAddress(sc.next());
		System.out.println("Deposit Amount");
		ac.setBalance(Validations.ValidAmount());

		Connection con = JDBConnection.getConnections();
		String insertAccount = "insert into Account (accountNo , accountHolderName ,accountType"
				+ " ,mobile ,email , adhar ,pancard ,address ,status  ,date ,balance)"
				+ "values(?,?,?,?,?,?,?,?,?,current_timestamp,?);";
		try {
			PreparedStatement ps = con.prepareStatement(insertAccount);
			ps.setLong(1, ac.getAccountNumber());
			ps.setString(2, ac.getAccountHolderName());
			ps.setString(3, ac.getAccountType());
			ps.setLong(4, ac.getMobileNumber());
			ps.setString(5, ac.getEmail());
			ps.setString(6, ac.getAdarNum());
			ps.setString(7, ac.getPanNum());
			ps.setString(8, ac.getAddress());
			ps.setBoolean(9, true);
			ps.setDouble(10, ac.getBalance());
			if (!ps.execute()) {

				System.out.println("\n Create Account Successfully...!\n");
				System.out.println("Generate Account No:" + ac.getAccountNumber());
			}
		} catch (SQLException e) {

			System.err.println(e.getMessage());
		}

	}

	@Override
	public void displayAccountDetails() {
		long accNo = checkAccountNumber();
		if (accNo != 0) {

			Connection con = JDBConnection.getConnections();
			String select = "select * from Account where accountNo=?";
			try {
				PreparedStatement ps = con.prepareStatement(select);
				ps.setLong(1, accNo);
				ResultSet rs = ps.executeQuery();
				System.out.println("Account Info:");
				while (rs.next()) {

					System.out.println(" Account No:" + rs.getLong("accountNo") + "\n Name:"
							+ rs.getString("accountHolderName") + "\n Type:" + rs.getString("accountType")
							+ "\n MobileNo:" + rs.getLong("mobile") + "\n Email:" + rs.getString("email")
							+ "\n Adhar NO:" + rs.getString("adhar") + "\n PanCard NO:" + rs.getString("pancard")
							+ "\n Address:" + rs.getString("address") + "\n Status:" + rs.getBoolean("status")
							+ "\n Open Time:" + rs.getTimestamp("date") + "\n Balance:" + rs.getDouble("balance"));
				}

			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}

	@Override
	public void checkBalance() {

		long accNo = checkAccountNumber();
		if (accNo != 0) {

			Connection con = JDBConnection.getConnections();
			String select = "select balance from Account where accountNo=?";
			try {
				PreparedStatement ps = con.prepareStatement(select);
				ps.setLong(1, accNo);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					System.out.println("\n Current Balance: " + rs.getDouble("balance") + "\n");

				}

			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
	}

	@Override
	public void deposit() {

		long accNo = checkAccountNumber();
		if (accNo != 0) {

			// System.out.println("Deposit");
			Double amount = Validations.ValidAmount();

			Connection con = JDBConnection.getConnections();
			String deposit = "update  Account set balance=balance+? where accountNo=?";
			try {
				PreparedStatement ps = con.prepareStatement(deposit);
				ps.setDouble(1, amount);
				ps.setLong(2, accNo);

				if (0 <= ps.executeUpdate()) {
					System.out.println("\n Deposit Amount Successfully... \n");
				}
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}

	}

	@Override
	public void withdraw() {

		boolean flag = true;
		long accNo = checkAccountNumber();
		if (accNo != 0) {
			Connection con = JDBConnection.getConnections();

			Double amount = Validations.ValidAmount();
			try {
				String select = "select balance from Account where accountNo=?";
				PreparedStatement ps = con.prepareStatement(select);
				ps.setLong(1, accNo);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					if (rs.getDouble("balance") >= amount) {

						flag = false;
						String deposit = "update  Account set balance=balance-? where accountNo=?";
						try {
							PreparedStatement ps1 = con.prepareStatement(deposit);
							ps1.setDouble(1, amount);
							ps1.setLong(2, accNo);

							if (0 <= ps1.executeUpdate()) {
								System.out.println("\n Withdraw Amount Successfully... \n");
							}
						} catch (SQLException e) {
							System.err.println(e.getMessage());
						}
					}

				}
				if (flag) {
					System.err.println("Insufficient balance..!");

				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

	@Override
	public void updateAccountInfo() {

		long accNo = checkAccountNumber();
		if (accNo != 0) {
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
					ac.setAccountHolderName(Validations.validName());
					updateAccount(accNo,"accountHolderName",ac.getAccountHolderName());
					break;
				case 2:
                    ac.setAccountType(Validations.validAccountType());
					updateAccount(accNo,"accountType",ac.getAccountType());

					break;
				case 3:
					ac.setMobileNumber(Validations.validContectNo());
					if (accNo != 0) {
                         String colome="mobile";
						Connection con = JDBConnection.getConnections();
						String update = "update Account set "+colome+" =? where accountNo=?";
						try {
							PreparedStatement ps = con.prepareStatement(update);
							ps.setLong(1, ac.getMobileNumber());
							ps.setLong(2, accNo);
							if (0 <= ps.executeUpdate()) {
								System.out.println("\n Update "+colome+"...! \n");
							}

						} catch (SQLException e) {
							System.err.println(e.getMessage());
						}
					}

					break;
				case 4:
					ac.setEmail(Validations.validEmail());
					updateAccount(accNo,"email",ac.getEmail());

					break;
				case 5:
					System.out.print("Enter Address:");
					ac.setAddress(sc.next());
					updateAccount(accNo,"address",ac.getAddress());

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

	}

	private void updateAccount(long accNo,String colome,String value) {
		
		if (accNo != 0) {

			Connection con = JDBConnection.getConnections();
			String update = "update Account set "+colome+" =? where accountNo=?";
			try {
				PreparedStatement ps = con.prepareStatement(update);
				ps.setString(1, value);
				ps.setLong(2, accNo);
				if (0 <= ps.executeUpdate()) {
					System.out.println("\n Update "+colome+"...! \n");
				}

			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}


		
	}

	

	@Override
	public void deleteAccount() {

		long accNo = checkAccountNumber();
		if (accNo != 0) {

			Connection con = JDBConnection.getConnections();
			String deleteAccount = "delete from Account where accountNo=?";
			try {
				PreparedStatement ps = con.prepareStatement(deleteAccount);
				ps.setLong(1, accNo);
				if (0 <= ps.executeUpdate()) {
					System.err.println("\n Delete Account...! \n");
				}

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public long checkAccountNumber() {
		boolean flag = true;
		System.out.println("---------------------------------------");

		long accNo = Validations.validAccountNo();
		System.out.println("---------------------------------------");

		Connection con = JDBConnection.getConnections();
		String select = "select accountNo from Account";
		try {
			PreparedStatement ps = con.prepareStatement(select);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				if (rs.getLong("accountNo") == accNo) {
					flag = false;
					return accNo;
				}
			}
			if (flag) {
				System.err.println("Account Not Existing...!");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return 0;
	}
	
	

}
