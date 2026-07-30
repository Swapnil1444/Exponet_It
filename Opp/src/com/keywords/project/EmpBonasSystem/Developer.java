package com.keywords.project.EmpBonasSystem;

public class Developer extends Employee{
	
	@Override
	public double calculateSalary() {
		return (super.calculateSalary()+10000);
	  }


}
