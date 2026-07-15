package com.method.EmpMangSyatem;

public class Dept {

	public void addEmp() {
		Emp e = new Emp();
		e.eId = 101;
		e.eName = "jay";
		e.salary = 20000.22;

		Company c = new Company();
		c.displayEmpDetiles(e);
	}

	public void AllAddEmp() {
		AllEmp a = new AllEmp();
		a.e1.eId = 11;
		a.e1.eName = "Om";
		a.e1.salary = 2000.2;

		a.e2.eId = 12;
		a.e2.eName = "ram";
		a.e2.salary = 2000.22;

		a.e3.eId = 13;
		a.e3.eName = "riya";
		a.e3.salary = 234567.33;

		Company c = new Company();
		c.displayAllEmp(a);

	}

}
