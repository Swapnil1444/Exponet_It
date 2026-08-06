package com.LogicalProgram.loops;

import java.util.Scanner;

public class LoopExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Number:");
		int n=sc.nextInt();
		countSumOfNum(n);

	}
	
	public static void countSumOfNum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			 sum+=i;
		}
		System.out.println(n+" Sum Of: "+sum);
	}


}
