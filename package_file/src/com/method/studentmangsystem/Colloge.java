package com.method.studentmangsystem;

public class Colloge {
	
	public void addStudent() {
		Student s=new Student();
		
		s.age=20;
		s.name="jay";
		s.branch="CS";
		s.id=11;
		
		Univrsity u=new Univrsity();
		u.displayStudentDetails(s);
	}
	
	public void addAllStudent() {
		
         AllStudent a=new AllStudent();
		
		a.s1.age=20;
		a.s1.name="jay";
		a.s1.branch="CS";
		a.s1.id=11;
		
		a.s2.id=12;
		a.s2.name="raj";
		a.s2.branch="CE";
		a.s2.age=22;
		
		a.s3.id=13;
		a.s3.name="om";
		a.s3.branch="CE";
		a.s3.age=23;
		
		a.s4.id=14;
		a.s4.name="Swapnil";
		a.s4.branch="CS";
		a.s4.age=22;
		
		Univrsity u=new Univrsity();
		u.displayALLStudentDetails(a);
		
	}

}
