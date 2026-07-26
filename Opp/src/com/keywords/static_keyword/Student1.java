package com.keywords.static_keyword;

public class Student1 {
	
	
	int id;
	String name;
	static String collge="DYP";
	
	public Student1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "Student:[Name:"+name+" Id:"+id+" Colloge:"+collge+"]";
	}

	public static void main(String[] args) {
		
		Student1 s1=new Student1(101,"swapnil");
		System.out.println(s1);
		
		Student1 s2=new Student1(102,"Jay");
		System.out.println(s2);
		

	}

}
