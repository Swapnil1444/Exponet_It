package com.usingToStringMethod;

public class Student {

	int id;
	String name;
	int age;
	
	public Student(int id,String name,int age) {
		this.age=age;
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "Student:{ Name:"+name+" Id:"+id+" Age:"+age+" }";
	}
	
}
