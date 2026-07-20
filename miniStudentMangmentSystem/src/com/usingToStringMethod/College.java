package com.usingToStringMethod;

public class College {
	
	public void addStudent() {
		Student s=new Student(1,"Swapnil", 21);
		University u=new University();
		u.displayStudent(s);
	}
	public void addAllStudent() {
		AllStudent a=new AllStudent();
		University u=new University();
		u.displayAllStudent(a);
	}

}
