package com.parameteriedConstructor;

public class Dept {
	public void addEmp() {
		Employee e = new Employee(101, "Swapnil", 20);
		Company c = new Company();
		c.displayEmp(e);
	}

	public void addAllEmp() {
		AllEmployee a = new AllEmployee();
		Company c = new Company();
		c.displayAllEmp(a);

	}

}
