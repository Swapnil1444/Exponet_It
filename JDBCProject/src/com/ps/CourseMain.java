package com.ps;

import java.util.Scanner;

public class CourseMain {

	static Scanner sc = new Scanner(System.in);
	static CourseServies c = new CourseServies();

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			System.out.println("-------------------------------");

			System.out.println("1.insert data \n2.update data \n3.delete data \n4.display data \n5.Exit");
			System.out.println("-------------------------------");

			System.out.print("select Option:");
			int key = sc.nextInt();
			System.out.println("-------------------------------");

			switch (key) {
			case 1:
				c.insertCourse();
				break;
			case 2:
				c.updateCourse();
				break;
			case 3:
				c.deleteCourse();
				break;
			case 4:
				c.displayCourse();
				break;
			case 5:
				flag = false;
				System.out.println("Exit...!");
				break;
			default:
				System.out.println("Invalid input");
			}
		}
	}

}
