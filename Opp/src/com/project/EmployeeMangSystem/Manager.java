package com.project.EmployeeMangSystem;

public class Manager extends Employee {

	private int teamSize;

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [Name=" + getName() + ", eId=" + geteId() + ", Salary=" + getSalary() + ", TeamSize="
				+ getTeamSize() + "]";
	}

}
