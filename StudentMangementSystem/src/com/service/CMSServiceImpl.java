package com.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.model.Batch;
import com.model.Course;
import com.model.Faculty;
import com.model.Student;

public class CMSServiceImpl implements CMSService {

	Scanner sc = new Scanner(System.in);
	List<Course> courseList = new ArrayList<Course>();
	List<Faculty> facultieList = new ArrayList<Faculty>();
	List<Batch> batchList = new ArrayList<Batch>();
	List<Student> studentds = new ArrayList<Student>();

	@Override
	public void addCourse() {
		int num = howToAddNum();
		for (int i = 0; i < num; i++) {
			Course c = new Course();
			System.out.println("------- " + (1 + i) + ").Course -------");
			System.out.print("Enter Course Id:");
			c.setCid(sc.nextInt());
			System.out.print("Enter Course Name:");
			sc.nextLine();
			c.setCname(sc.nextLine());
			courseList.add(c);

		}
		System.out.println("\nAdd Course Successfully...!\n");
	}

	public int howToAddNum() {
		System.out.print("How many numbers should be added:");
		try {
			int num = sc.nextInt();
			System.out.println("-----------------------------------------------");
			return num;
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input Enter Only Digit...!");
			sc.nextLine();
			return howToAddNum();

		}

	}

	@Override
	public void displayCourse() {
		System.out.println("Course List:             ");
		// System.out.println("-----------------------------------------------");

		for (Course c : courseList) {
			System.out.println(" Id:" + c.getCid() + " Name:" + c.getCname());
		}
		System.out.println("-----------------------------------------------");

	}

	@Override
	public void addFaculty() {

		boolean flag = true, flag1 = false;

		int num = howToAddNum();
		for (int i = 0; i < num; i++) {
			Faculty f = new Faculty();
			System.out.println("------- " + (1 + i) + ").Faculty -------");
			System.out.print("Enter Faculty Id:");
			f.setFid(sc.nextInt());
			System.out.print("Enter Faculty Name:");
			sc.nextLine();
			f.setFname(sc.nextLine());
			System.out.println("-----------------------------------------------");

			displayCourse();
			System.out.print("Which Course do you want to add using Id:");
			int cid = sc.nextInt();
			for (Course c : courseList) {
				if (cid == c.getCid()) {
					f.setCourse(c);
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.println("This course is not available..!");
				return;
			} else {
				facultieList.add(f);
				flag1 = true;
			}
		}
		if (flag1) {
			System.out.println("\nAdd Faculty Successfully...!\n");
		}
	}

	@Override
	public void displayFaculty() {

		System.out.println("Faculty List:             ");
		// System.out.println("-----------------------------------------------");

		for (Faculty f : facultieList) {
			System.out.println(" Id:" + f.getFid() + " Name:" + f.getFname() + " Course:" + f.getCourse());
		}
		System.out.println("-----------------------------------------------");

	}

	@Override
	public void addBatch() {
		boolean flag = true, flag1 = false;
		int num = howToAddNum();
		for (int i = 0; i < num; i++) {
			Batch b = new Batch();
			System.out.println("------- " + (1 + i) + ").Batch -------");
			System.out.print("Enter Batch Id:");
			b.setBid(sc.nextInt());
			System.out.print("Enter Batch Name:");
			b.setBatchName(sc.next());

			System.out.println("-----------------------------------------------");
			displayFaculty();
			System.out.print("Which Faculty do you want to add using Id:");
			int fid = sc.nextInt();

			for (Faculty f : facultieList) {
				if (fid == f.getFid()) {
					b.setFaculty(f);
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("This Faculty is not available..!");
				return;
			} else {
				batchList.add(b);
				flag1 = true;
			}
			if (flag1) {
				System.out.println("\nAdd Batchs Successfully...!\n");
			}
		}

	}

	@Override
	public void displayBatch() {
		System.out.println("Batch List:");
		// System.out.println("-----------------------------------------------");
		for (Batch b : batchList) {
			System.out.println(b);
		}
		System.out.println("-----------------------------------------------");
	}

	@Override
	public void addStudent() {
		boolean flag = true, flag1 = false;
		int num = howToAddNum();
		for (int i = 0; i < num; i++) {
			Student s = new Student();
			System.out.println("------- " + (1 + i) + ").Student -------");
			System.out.print("Enter Student Id:");
			s.setSid(sc.nextInt());
			System.out.print("Enter Student Name:");
			sc.nextLine();
			s.setSname(sc.nextLine());

			System.out.println("-----------------------------------------------");
			displayBatch();
			System.out.print("Which Batch do you want to add using Id:");
			int bid = sc.nextInt();

			for (Batch b : batchList) {
				if (bid == b.getBid()) {
					s.setBatch(b);
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("This Batch is not available..!");
				return;
			} else {
				studentds.add(s);
				flag1 = true;
			}
			if (flag1) {
				System.out.println("\nAdd Students Successfully...!\n");
			}
		}

	}

	@Override
	public void displayStudent() {
		System.out.println("Student List:");
		// System.out.println("-----------------------------------------------");
		for (Student s : studentds) {
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------");
	}
	@Override
	public void updateInfo() {

	}

	@Override
	public void deleteInfo() {

	}

}
