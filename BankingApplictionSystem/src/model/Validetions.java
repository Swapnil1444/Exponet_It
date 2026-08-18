package model;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validetions {

	static Scanner sc = new Scanner(System.in);

	public static String validName() {

		System.out.print("Enter Account Holder Name:");
		String name = sc.next();
		if (Pattern.matches("[A-Za-z]+", name)) {
			return name;
		}
		System.err.println("Invalid Name...!");
		return validName();
	}

	public static String validAdharNo() {
		sc.nextLine();
		System.out.print("Enter Aadhaar Number:");
		String no = sc.next();
		if (Pattern.matches("[2-9]{1}[0-9]{3}[0-9]{4}[0-9]{4}", no)) {
			return no;
		}
		System.err.println("Invalid Aadhar Number...!");
		return validAdharNo();
	}

	public static String validPanNo() {
		System.out.print("Enetr Pan Card Number:");
		String panNo = sc.next();
		if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panNo)) {
			return panNo;
		}
		System.err.println("Invalid Pan Card Number...!");
		return validPanNo();
	}

	public static long validContectNo() {
		System.out.print("Enter Moblie Number:");
		String contectNo = sc.next();
		if (Pattern.matches("[6-9]{1}[0-9]{9}", contectNo)) {
			return Long.parseLong(contectNo);
		}
		System.err.println("Invalid Contect Number...!");
		return validContectNo();
	}
	
	public static String validEmail() {
		System.out.print("Enter Email:");
		String email=sc.next();
		if(Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", email)) {
			return email;
		}
		System.err.println("Invalid Email Address...!");
		return validEmail();
	}
}
