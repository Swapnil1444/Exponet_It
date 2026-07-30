package com.keywords.project.EmpBonasSystem;

public class EmpBonasSystem {

	public static void main(String[] args) {
		

		Employee e=new Developer();
		e.setSalary(50000);
		System.out.println("Developer Final Salary: $"+e.calculateSalary());
		
		Employee t=new Testar();
		t.setSalary(30000);
		System.out.println("Testar Final Salary: $"+t.calculateSalary());
		
		Employee m=new Manager();
		m.setSalary(30000);
		System.out.println("Manager Final Salary: $"+m.calculateSalary());
		
		
		
	}

}
