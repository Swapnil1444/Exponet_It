package com.getsetMethod;

public class Company {
	
	public void displayEMP(Emp e) {
		
		System.out.println("*****Single Emp*****");
		
		System.out.println("Emp name:"+e.getName()+" Id:"+e.getEid()+" Salary:"+e.getSalary());
	}
	public void displayAllEMP(AllEmp a) {
		System.out.println("*****All Emp******");
		
		System.out.println("Emp name:"+a.e1.getName()+" Id:"+a.e1.getEid()+" Salary:"+a.e1.getSalary());
		System.out.println("Emp name:"+a.e2.getName()+" Id:"+a.e2.getEid()+" Salary:"+a.e2.getSalary());
		
	}
	
	
	
	public static void main(String[] args) {
		Dept d=new Dept();
		Emp e=new Emp();
		d.addEmp(e);
		d.addAllEmp();
		
		
	}

}
