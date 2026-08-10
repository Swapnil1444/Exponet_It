package com.arrayExample;

public class College {

	public Student[] addStudent() {
		Student s1=new Student();
		s1.setStudId(101);
		s1.setStudName("Om");
		
		Student s2= new Student();
		s2.setStudId(102);
		s2.setStudName("jay");
		
		Student s3=new Student();
		s3.setStudId(103);
		s3.setStudName("Swapnil");
		
		Student [] arStudents= {s1,s2,s3};
	   return arStudents;
		
	}
}
