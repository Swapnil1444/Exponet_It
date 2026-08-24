package Validations;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidation {

	static Scanner sc = new Scanner(System.in);

	public static int validId() {
		System.out.print("Enter User Id:");
		String id = sc.next();
		if (Pattern.matches("[0-9]+", id)) {
			return Integer.parseInt(id);
		}
		System.err.println("Invalid User Id..!");
		return validId();
	}
	
	public static String validName() {
		System.out.print("Enter User Name:");
		String name=sc.next();
		if(Pattern.matches("[A-Za-z]+", name))
		{
			return name;
		}
		System.err.println("Invalid User Name..!");
		return validName();
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

	public static String validContectNo() {
		System.out.print("Enter Moblie Number:");
		String contectNo = sc.next();
		if (Pattern.matches("[6-9]{1}[0-9]{9}", contectNo)) {
			return contectNo;
		}
		System.err.println("Invalid Contect Number...!");
		return validContectNo();
	}

	public static String validEmail() {
		System.out.print("Enter Email:");
		String email = sc.next();
		if (Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", email)) {
			return email;
		}
		System.err.println("Invalid Email Address...!");
		return validEmail();
	}
	
	

}
