package com.method.EmpMangSyatem;

public class Company {

	public void displayEmpDetiles(Emp e) {
		System.out.println("Emp Id:" + e.eId + " Name:" + e.eName + " Salary:" + e.salary);
	}

	public void displayAllEmp(AllEmp a) {
		System.out.println("All Emp Info:");
		System.out.println("Emp Id:" + a.e1.eId + " Name:" + a.e1.eName + " Salary:" + a.e1.salary);
		System.out.println("Emp Id:" + a.e2.eId + " Name:" + a.e2.eName + " Salary:" + a.e2.salary);
		System.out.println("Emp Id:" + a.e3.eId + " Name:" + a.e3.eName + " Salary:" + a.e3.salary);


	}

	public static void main(String[] args) {

		Dept d = new Dept();
		d.addEmp();
		d.AllAddEmp();

	}

}
