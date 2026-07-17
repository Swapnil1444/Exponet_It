package com.geteersetter;

public class University {

	public void displayStudent(Student s) {
		System.out.println("Student name:"+s.getName()+" RollNo:"+s.getRollNo()+" Grade:"+s.getGrade());
	}
	
	public void displayAllStudent(AllSudent a) {
		System.out.println("****All Student Info****");
		System.out.println("Student name:"+a.s1.getName()+" RollNo:"+a.s1.getRollNo()+" Grade:"+a.s1.getGrade());
		System.out.println("Student name:"+a.s2.getName()+" RollNo:"+a.s2.getRollNo()+" Grade:"+a.s2.getGrade());
		System.out.println("Student name:"+a.s3.getName()+" RollNo:"+a.s3.getRollNo()+" Grade:"+a.s3.getGrade());

		
	}
	
	
	public static void main(String[] args) {
		College c=new College();
		c.addStudent();
		c.addAllStudent();
		
		

	}

}
