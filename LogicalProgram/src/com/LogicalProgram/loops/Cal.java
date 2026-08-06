package com.LogicalProgram.loops;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Frist Number:");
		int n1 = sc.nextInt();
		System.out.print("Enter Second Number:");
		int n2 = sc.nextInt();

		System.out.println("--------------");
		System.out.print("Select Option(+,-,/,*):");
		String ch = sc.next();

		switch (ch) {
		case "+":
			System.out.println(n1 + "+" + n2 + ":" + (n1 + n2));
			break;
		case "-":
			System.out.println(n1 + "-" + n2 + ":" + (n1 - n2));
			break;
		case "/":
			if (!(n2>=
			1)) {
				System.out.println("n2 is zero.");
			} else {
				System.out.println(n1 + "/" + n2 + ":" + (n1 / n2));
			}
			break;
		case "*":
			System.out.println(n1 + "*" + n2 + ":" + (n1 * n2));
			break;

		default:
			System.err.println("Invalid Input..!");
		}

	}

}
