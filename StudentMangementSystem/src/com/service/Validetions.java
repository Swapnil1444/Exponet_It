package com.service;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validetions {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int validInputId() {
		System.out.print("Enter Id:");
		String id=sc.next();
		if(Pattern.matches("[0-9]+", id)) {
			
			return Integer.parseInt(id);
		}
		System.err.println("Invalid Input Enter Only Digit..!");
		
		return validInputId();
	}
	
	public static String validName() {
		System.out.print("Enter Name:");
		String name=sc.next();
		if(Pattern.matches("[A-Za-z]+", name)) {
			return name;
		}
		System.err.println("Invalid Name...!");
		return validName();
	}

}
