package com.LogicalProgram.ifelseBased;

public class IfElseQ {

	public static void main(String[] args) {

		// 1. check even odd number
		System.out.println("1 and 2.check even odd number");
		System.out.println(checkEven(20));

		//  3. *Check if a number is divisible by 5*
		System.out.println("3.Check if a number is divisible by 5");
		System.out.println(CheckNumberDiv5(10));

		System.out.println("4.Check if a number is divisible by both 3 and 7");
		System.out.println(checkNumDivBoth3And7(20));
		
		System.out.println(" 5.Check if a number is a 3-digit number ");
		System.out.println(checkNum3Digit(1111));
		
		System.out.println("6. Check if two integers are equal");
		
		

	}

	public static String checkEven(int n) {
		if (n % 2 == 0) {
			return "Even Number." + n;
		}
		return "Odd Number." + n;
	}

	public static String CheckNumberDiv5(int n) {
		if (n % 5 == 0) {
			return " Divisible by 5 :" + n;
		}
		return "Not Divisible by 5 :" + n;
	}

	public static String checkNumDivBoth3And7(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "Divisible by 3 and 7 :"+n;
		}
		return " Not Divisible by 3 and 7 :"+n;
	}
	
	public static String checkNum3Digit(int n) {
		if(n>=100&&n<=999) {
			return"Three-digit number:"+n;
		}
		return"Not Three-digit number :"+n;
	}
	
	
}
