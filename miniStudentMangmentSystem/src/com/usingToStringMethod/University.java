package com.usingToStringMethod;

public class University {

	public void displayStudent(Student s) {
		System.out.println(s);
	}
	
	public void displayAllStudent(AllStudent a) {
		System.out.println("All Student:");
		System.out.println(a.s1);
		System.out.println(a.s2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		College c=new College();
		c.addStudent();
		c.addAllStudent();
	}

}
