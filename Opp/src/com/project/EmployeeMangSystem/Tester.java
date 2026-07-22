package com.project.EmployeeMangSystem;

public class Tester extends Employee {

	private int bugsFixd;

	public void setBugeFixd(int bugs) {
		bugsFixd = bugs;
	}

	public int getBugeFixd() {
		return bugsFixd;
	}

	@Override
	public String toString() {
		return "Tester [bugsFixd=" + bugsFixd + ", Name=" + getName() + ", Id=" + geteId() + ", Salary=" + getSalary()
				+ "]";
	}

}
