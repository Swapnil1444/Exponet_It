package com.LogicalProgram.ifelseBased;

public class IfElseQ {

	public static void main(String[] args) {

		// 1. check even odd number
		System.out.println(" 1 and 2.check even odd number");
		System.out.println(checkEven(20));

		//  3. *Check if a number is divisible by 5*
		System.out.println(" 3.Check if a number is divisible by 5");
		System.out.println(CheckNumberDiv5(10));

		System.out.println(" 4.Check if a number is divisible by both 3 and 7");
		System.out.println(checkNumDivBoth3And7(20));

		System.out.println(" 5.Check if a number is a 3-digit number ");
		System.out.println(checkNum3Digit(1111));

		System.out.println(" 6. Check if two integers are equal");
		System.out.println(checkEqualtwoNum(20, 20));

		System.out.println(" 7.Check if a number ends with 5 ");
		checkNumEnd5(1234);

		System.out.println(" 8.Check if the square of a number is greater than the number itself");
		checkSquareNumGreater(10);

		System.out.println(" 9.Check if the sum of two numbers is greater than 100 ");
		checkSumOfNum(100, 200);

		System.out.println(" 10.Check if the cube of a number is less than 1000");
		checkCubeNum(1233);

		System.out.println(" 11.Check if a number is divisible by 9 but not by 6");
		checkNumDiv9(4);

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
			return "Divisible by 3 and 7 :" + n;
		}
		return " Not Divisible by 3 and 7 :" + n;
	}

	public static String checkNum3Digit(int n) {
		if (n >= 100 && n <= 999) {
			return "Three-digit number:" + n;
		}
		return "Not Three-digit number :" + n;
	}

	public static String checkEqualtwoNum(int n1, int n2) {
		if (n1 == n2) {
			return "Equal Number:" + n1 + "=" + n2;
		}
		return "Not Equal Number:" + n1 + "!=" + n2;
	}

	public static void checkNumEnd5(int n) {
		if (n % 10 == 5) {
			System.out.println(n + " is end with 5.");
		} else {
			System.out.println(n + " is not end with 5.");
		}
	}

	public static void checkSquareNumGreater(int num) {
		if (num * num > num) {
			System.out.println("Square is greater: " + num);
		} else {
			System.out.println("Square is Not greater: " + num);
		}
	}

	public static void checkSumOfNum(int n1, int n2) {
		if (n1 + n2 > 100) {
			System.out.println("Sum exceeds 100");
		} else {
			System.out.println("Sum Not exceeds 100");
		}
	}

	public static void checkCubeNum(int num) {
		if (num * num * num < 1000) {
			System.out.println("cube value:" + num);
		} else {
			System.out.println("no cube value");
		}

	}

	public static void checkNumDiv9(int n){
           if(n%9==0&&!(n%6==0)) {
        	   System.out.println("Divisible by 9 only");
           }else {
        	   System.out.println("Not Divisible by 9 only");
           }
	}
}
