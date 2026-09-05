package com.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.service.CMSService;
import com.service.CMSServiceImpl;

public class StudentMngSystemMain {

	static CMSService cms = new CMSServiceImpl();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		MainMenu();
	}

	public static void MainMenu() {
		int key = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("***********************************************");
			System.out.println("*           STUDENT MANGEMENT SYSTEM          *");
			System.out.println("***********************************************");
			System.out.println(
					"1.Add Course \n2.Add Faculty \n3.Add Batch \n4.Add Student \n5.Display Course \n6.Display Faculty \n7.Display Batch \n8.Display Student \n9.Update Info \n10.Delete Info \n11.Exit");
			System.out.println("-----------------------------------------------");
			System.out.print("Select Option:");
			try {
				key = sc.nextInt();
				System.out.println("-----------------------------------------------");
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Invalid Input Enter Only Digit...!");
			}

			switch (key) {
			case 1:
				cms.addCourse();
				break;
			case 2:
				cms.addFaculty();
				break;
			case 3:
				cms.addBatch();
				break;
			case 4:
				cms.addStudent();
				break;
			case 5:
				cms.displayCourse();
				break;
			case 6:
				cms.displayFaculty();
				break;
			case 7:
				cms.displayBatch();
				break;
			case 8:
				cms.displayStudent();
				break;
			case 9:
				cms.updateInfo();
				break;
			case 10:
				cms.deleteInfo();
				break;
			case 11:
				System.out.println("Exit..!");
				flag = false;
				break;

			default:
				break;
			}

			System.out.println("-----------------------------------------------");
		}
	}
}
