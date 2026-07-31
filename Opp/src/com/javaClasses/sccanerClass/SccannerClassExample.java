package com.javaClasses.sccanerClass;

import java.util.Scanner;

public class SccannerClassExample {

//	Scanner sc=new Scanner(System.in);
//	int s=sc.nextInt();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name:");
		String name = sc.nextLine();

		// System.out.println();
		System.out.print("Enter Age:");
		int age = sc.nextInt();

		System.out.print("Enetr RollNo:");
		int rollno = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter College Name:");
		String clgName = sc.nextLine();

		System.out.println("===Student Info===\nName:" + name + " \nAge:" + age + " \nRollNo:" + rollno
				+ " \nCollege Name:" + clgName);

	}

}
