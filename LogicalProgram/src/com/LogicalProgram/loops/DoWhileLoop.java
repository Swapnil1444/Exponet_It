package com.LogicalProgram.loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		checkEvenAndPositiv(n);
		
		System.out.println("--------------------");
		
		System.out.println("Enetr the number to print:");
		int n1=sc.nextInt();
		printNum(n1);
		
		
	}
	
	public static void checkEvenAndPositiv(int n) {
		if(n%2==0&&n>=0) {
			System.out.println("Number is Even and positive.");
		}else {
			System.out.println("Number are not Positive and odd");
		}	
	}
	
    public static void printNum(int n) {
    	
//    	for(int i=0;i<=n;i++) {
//    		System.out.println(i);
//    	}
    	
    	int i=0;
    	do {
    		System.out.println(i);
    		i++;
    	}while(i<=n);
    	
    	
//    	while(i<=n) {
//    		System.out.println(i);
//    		i++;
//    	}
    	
    }
	
    
	
	

}
