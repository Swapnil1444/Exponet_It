package fileOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import model.Account;

public class FileOperation {
	static Scanner sc = new Scanner(System.in);

	public static void saveAccount(Account ac) throws IOException {

		FileWriter fw = new FileWriter("Accounts.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(ac.getAccountNumber() + "," + ac.getAccountHolderName() + "," + ac.getAccountType() + ","
				+ ac.getAdarNum() + "," + ac.getAddress() + "," + ac.getBalance() + "," + ac.getBranchName()+","+ac.getEmail()+","+ac.getMobileNumber()+","+ac.getPanNum());
		bw.newLine();
		bw.close();
		System.out.println("\nAccount No:" + ac.getAccountNumber() + "\nNew Account create successfully...😎\n");
	}

	public static void displayAllDetiles() throws IOException {
		FileReader fr = new FileReader("Accounts.txt");
		BufferedReader br = new BufferedReader(fr);
		String data;
		System.out.println("=======================================");
		System.out.println("         Account Information           ");
		System.out.println("=======================================");
		System.out.printf("%-14s %-14s %-9s %-10s %-10s %-10s %-10s%n", " Account No", "Holder Name", "Type",
				"Aadhar No", "Address", "Balance", "Branch Name");
		System.out.println("--------------------------------------------------------------------------------------");
		while ((data = br.readLine()) != null) {
			String[] arr = data.split(",");
			System.out.printf("%-14s %-14s %-6s %-10s %-10s %-10s %-1s%n", arr[0], arr[1], arr[2], arr[3], arr[4],
					arr[5], arr[6]);

			System.out.println();
		}
//		data=br.readLine();
//		String []arr=data.split(",");
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		for(int i=0;i<data.length();i++) {
//			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n","", "AccountHolderName", "AccountType","AadharNo","Address","Balance","BranchName");
//		}
		System.out.println("--------------------------------------------------------------------------------------");

		br.close();
		System.out.println("=======================================");
	}

	public static void showFileInfo() {

		File f = new File("Accounts.txt");
		if (f.exists()) {
			System.out.println("=======================================");
			System.out.println("           File Information            ");
			System.out.println("=======================================");
			System.out.println("File Name:" + f.getName());
			System.out.println("File Path:" + f.getAbsolutePath());
			System.out.println("File Size:" + f.length() + "byte");
			System.out.println("Can Read:" + f.canRead());
			System.out.println("Can Write:" + f.canWrite());

		} else {
			System.out.println("File Not Found..!");
		}

	}

	public static void fileBackupData() throws IOException {

		FileInputStream fi = new FileInputStream("Accounts.txt");
		FileOutputStream fo = new FileOutputStream("backup_Account.txt");
		int data;
		while ((data = fi.read()) != -1) {
			fo.write(data);
		}
		fi.close();
		fo.close();
		System.out.println("Backup File Successfully");

	}

	public static void deleteFile() {
		File f = new File("backup_Account.txt");
		if (f.exists()) {
			if (f.delete()) {
				System.out.println("Delete File Successfully");
			} else {
				System.out.println("Unable delete the file..!");
			}
		} else {
			System.out.println("File Not Existes...!");
		}

	}

	public static void SherchAccount() throws IOException {
		FileReader fr = new FileReader("Accounts.txt");
		BufferedReader br = new BufferedReader(fr);
		String[] arr = checkAccountNo();
		System.out.println("=======================================");
		System.out.println("         Account Information           ");
		System.out.println("=======================================");
		System.out.printf("%-14s %-14s %-9s %-10s %-10s %-10s %-10s%n", " Account No", "Holder Name", "Type",
				"Aadhar No", "Address", "Balance", "Branch Name");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.printf("%-14s %-14s %-6s %-10s %-10s %-10s %-1s%n", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5],
				arr[6]);
		System.out.println();

		System.out.println("--------------------------------------------------------------------------------------");

		br.close();
	}

	public static String[] checkAccountNo() throws IOException {
		System.out.print("Enter Account Number:");
		String acNo = sc.next();
		String data;
		FileReader fr = new FileReader("Accounts.txt");
		BufferedReader br = new BufferedReader(fr);
		while ((data = br.readLine()) != null) {
			String[] arr = data.split(",");
			if (acNo.equals(arr[0])) {
				return arr;
			}
		}
		System.err.println("Invalid Account No...!");
		return checkAccountNo();

	}

}
