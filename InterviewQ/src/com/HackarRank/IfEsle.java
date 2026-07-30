package com.HackarRank;

import java.util.Scanner;

public class IfEsle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int N = 22;
		if (N > 0) {
			if (N % 2 == 0) {
				if (N >= 2 && N <= 5) {
					System.out.println("Not Weird");
				} 
				else if (N >= 6 && N <= 20) {
					System.out.println("Weird");
				} else {
					System.out.println("Not Weird");
				}
			} else {
				System.out.println("Weird");
				
			}
		}

	}

}
