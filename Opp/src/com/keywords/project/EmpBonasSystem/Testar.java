package com.keywords.project.EmpBonasSystem;

public class Testar extends Employee{

	@Override
	public double calculateSalary() {
		return (super.calculateSalary()+5000);
	  }
}
