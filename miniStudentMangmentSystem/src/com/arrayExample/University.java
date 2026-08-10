package com.arrayExample;

public class University {

	public static void main(String[] args) {
		
		College c=new College();
		
		for(Student stud:c.addStudent()) {
			System.out.println(stud);
		}

	}

}
