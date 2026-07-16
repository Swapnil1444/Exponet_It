package com.method.studentmangsystem;

public class Univrsity {
	
	public void displayStudentDetails(Student s) {
		
		System.out.println("Student Info: Name:"+s.name+" RollNo "+s.id+" Age:"+s.age+" Branch:"+s.branch);
		
	}

	public static void main(String[] args) {
		
      Colloge c=new Colloge();
      c.addStudent();
      c.addAllStudent();
	}
	
	public void displayALLStudentDetails(AllStudent a) {
		System.out.println("All Student Info:");
		
		System.out.println("Student Info: Name:"+a.s1.name+" RollNo "+a.s1.id+" Age:"+a.s1.age+" Branch:"+a.s1.branch);
		System.out.println("Student Info: Name:"+a.s2.name+" RollNo "+a.s2.id+" Age:"+a.s2.age+" Branch:"+a.s2.branch);
		System.out.println("Student Info: Name:"+a.s3.name+" RollNo "+a.s3.id+" Age:"+a.s3.age+" Branch:"+a.s3.branch);
		System.out.println("Student Info: Name:"+a.s4.name+" RollNo "+a.s4.id+" Age:"+a.s4.age+" Branch:"+a.s4.branch);

	}

}
