package com;

public class University {

	public static void main(String[] args) {
		Colloge c=new Colloge();
		Student s= c.addStudent();
		System.out.println("Single Student:");
		System.out.println("RollNo:"+s.rollNo+" Name:"+s.name+" Address:"+s.address);
		
		
		System.out.println("All Student:");
		ALLStudent all=c.AllStudDetiles();
		System.out.println("RollNo:"+all.jay.rollNo+" Name:"+all.jay.name+" Address:"+all.jay.address);
		System.out.println("RollNo:"+all.om.rollNo+" Name:"+all.om.name+" Address:"+all.om.address);
		System.out.println("RollNo:"+all.ram.rollNo+" Name:"+all.ram.name+" Address:"+all.ram.address);
		System.out.println("RollNo:"+all.swapnil.rollNo+" Name:"+all.swapnil.name+" Address:"+all.swapnil.address);

		
	}

}
