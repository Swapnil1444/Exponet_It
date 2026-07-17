package com.parameteriedConstructor;

public class Univercity {  
	
	public void displayStudent(Student s) {
		System.out.println("Student Info:\n Name:"+s.name+" \n Age:"+s.age+" \n Roll no:"+s.id);
	}
	
	public void displayAllStudent(AllStudent a) {
		System.out.println("All Student Info:");
		System.out.println(" Roll no: "+a.s1.id+" Name: "+a.s1.name+" age: "+a.s1.age);
		System.out.println(" Roll no: "+a.s2.id+" Name: "+a.s2.name+" age: "+a.s2.age);
		System.out.println(" Roll no: "+a.s3.id+" Name: "+a.s3.name+" age: "+a.s3.age);
	}
	

	public static void main(String[] args) {

		College c=new  College();
		c.addStudent();
		c.addAllStudent();

	}

}
