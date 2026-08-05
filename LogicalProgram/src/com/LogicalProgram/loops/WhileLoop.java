package com.LogicalProgram.loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr number:");
		int n=sc.nextInt();
		caluTable(n);

	}
	
	public static void caluTable(int n) {
		int i=1;
		while(i<=10) {
			System.out.println(i+"x"+n+"="+(i*n));
			i++;
		}
	}

}
