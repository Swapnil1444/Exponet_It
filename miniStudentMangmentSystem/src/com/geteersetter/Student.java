package com.geteersetter;

public class Student {

	private int rollNo;
	private String name;
	private char grade;

	public void setRollNo(int rollno) {
		rollNo = rollno;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public char getGrade() {
		return grade;
	}

}
