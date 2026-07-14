package com;

public class Colloge {
	
	public Student addStudent() {
		Student s=new Student();
		
		s.name="swapnil";
		s.rollNo=22;
		s.address="pune";
		
		return s;
	}
	
	public ALLStudent AllStudDetiles() {
		
		ALLStudent all=new ALLStudent();
		
		all.jay.rollNo=101;
		all.jay.name="Jay";
		all.jay.address="pune";
		
		all.om.rollNo=102;
		all.om.name="Om";
		all.om.address="pcmc";
		
		all.ram.rollNo=103;
		all.ram.name="Ram";
		all.ram.address="nagapur";
		
		all.swapnil.name="swapnil";
		all.swapnil.rollNo=22;
		all.swapnil.address="pune";
		
		
		
		return all;
		
	}
	
	

}
