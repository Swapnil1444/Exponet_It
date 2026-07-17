package com.geteersetter;

public class College {

	public void addStudent() {
		Student s=new Student();
		
		s.setGrade('A');
		s.setName("Swapnil");
		s.setRollNo(11);
		
		University u=new University();
		u.displayStudent(s);
	}
	
	public void addAllStudent() {
		AllSudent a=new AllSudent();
		
		a.s1.setGrade('A');
		a.s1.setName("RAj");
		a.s1.setRollNo(11);
		
		a.s2.setRollNo(12);
		a.s2.setName("Om");
		a.s2.setGrade('B');
		
		a.s3.setName("jay");
		a.s3.setRollNo(13);
		a.s3.setGrade('C');
		
		University u=new University();
		u.displayAllStudent(a);
	}
	
}
