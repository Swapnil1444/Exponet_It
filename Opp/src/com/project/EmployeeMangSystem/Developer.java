package com.project.EmployeeMangSystem;

public class Developer extends Employee{
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Developer [language=" + language + ", Name=" + getName() + ", Id=" + geteId()
				+ ", Salary=" + getSalary() + "]";
	}

	
}
