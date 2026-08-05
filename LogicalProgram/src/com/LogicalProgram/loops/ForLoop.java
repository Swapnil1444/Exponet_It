package com.LogicalProgram.loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr number:");
		int n=sc.nextInt();
		caluTable(n);

	}
	
	public static void caluTable(int n) {
		for(int i=1;i<=10;i++){
			System.out.println(i+"x"+n+"="+(i*n));
		}
	}

	

}
