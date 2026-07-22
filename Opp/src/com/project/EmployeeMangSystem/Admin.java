package com.project.EmployeeMangSystem;

public class Admin {

	public static void main(String[] args) {
		
		System.out.println("===Employee Info===");
		Employee e=new Employee();
		e.seteId(101);
		e.setName("om");
		e.setSalary(200000.22);
		System.out.println(e);
	
		System.out.println("===Manager Class===");
		Manager m=new Manager();
		m.seteId(101);
		m.setName("Swapnil");
		m.setSalary(20000);
		m.setTeamSize(10);
		System.out.println(m);
		
		System.out.println("===Tester Class===");
		Tester t=new Tester();
		t.seteId(102);
		t.setName("Raj");
		t.setSalary(23000);
		t.setBugeFixd(10);
		System.out.println(t);
		
		System.out.println("===Developer Class===");
		Developer d=new Developer();
		d.seteId(103);
		d.setLanguage("Java");
		d.setName("Swapnil");
		d.setSalary(280000);
		System.out.println(d);
		
		
		
		

	}

}
