package com.parameteriedConstructor;

public class Company {

	public void displayEmp(Employee e) {
		System.out.println("Emp info: \n name:" + e.Ename + "\n age:" + e.age + "\n id:" + e.id);
	}

	public void displayAllEmp(AllEmployee a) {
		System.out.println("***ALL EMPLOYEE***");
		System.out.println("Emp info: \n name:" + a.e1.Ename + "\n age:" + a.e1.age + "\n id:" + a.e1.id);
		System.out.println("Emp info: \n name:" + a.e2.Ename + "\n age:" + a.e2.age + "\n id:" + a.e2.id);
		System.out.println("Emp info: \n name:" + a.e3.Ename + "\n age:" + a.e3.age + "\n id:" + a.e3.id);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d = new Dept();
		d.addEmp();
		d.addAllEmp();

	}

}
