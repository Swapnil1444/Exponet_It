package com.conditionStatemend.ifelseStatments;

import java.util.Scanner;

public class EvenOdd {

	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr Number:");
		int n=sc.nextInt();
		System.out.println(evenOddCheck(n));
		
	}
	public static String evenOddCheck(int n) {
		if(n%2==0)
		{
			return" It is Even Number- "+n;
		}
		return "It is Odd Number- "+n;
	}

}
