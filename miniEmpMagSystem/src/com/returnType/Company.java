package com.returnType;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dept d=new Dept();
		Emp e=d.addEmp();
		System.out.println("Emp name:"+e.eName+" Age:"+e.age+" Salary:"+e.salary);

		System.out.println("All Student:");
		AllEmp a=d.allEmpDetails();
		System.out.println("Emp name:"+a.nayan.eName+" Age:"+a.nayan.age+" Salary:"+a.nayan.salary);
		System.out.println("Emp name:"+a.prachi.eName+" Age:"+a.prachi.age+" Salary:"+a.prachi.salary);
		System.out.println("Emp name:"+a.omkar.eName+" Age:"+a.omkar.age+" Salary:"+a.omkar.salary);
		System.out.println("Emp name:"+a.vijay.eName+" Age:"+a.vijay.age+" Salary:"+a.vijay.salary);

		
	}

}
