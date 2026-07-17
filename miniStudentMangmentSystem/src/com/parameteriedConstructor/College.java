package com.parameteriedConstructor;

public class College {
	
	public void addStudent() {
		Student s=new Student(01,"Swapnil" ,21);
		Univercity u=new Univercity();
		u.displayStudent(s);
	}
	public void addAllStudent() {
		AllStudent a=new AllStudent();
		Univercity u=new Univercity();
		u.displayAllStudent(a);
	}

}
