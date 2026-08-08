package com.validetions;

import java.util.Scanner;

public class Logicas {

	public static void main(String[] args) {

		String aadhaar = "234567890124";

		boolean valid = true;

		// Check length
		if (aadhaar.length() != 12) {
			valid = false;
		}

		// Check each character is a digit
		for (int i = 0; i < aadhaar.length(); i++) {

			char ch = aadhaar.charAt(i);

			if (ch < '0' || ch > '9') {
				valid = false;
				break;
			}
		}

		// Check first digit
		if (aadhaar.charAt(0) < '2' || aadhaar.charAt(0) > '9') {
			valid = false;
		}

		if (valid) {
			System.out.println("Valid Aadhaar Number");
		} else {
			System.out.println("Invalid Aadhaar Number");
		}

		System.out.printf("%-15s %-5s %n", "Account ", "Info");
		System.out.println("----------------------------------------");

	}

}
