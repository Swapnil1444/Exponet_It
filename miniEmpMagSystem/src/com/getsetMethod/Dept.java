package com.getsetMethod;

public class Dept {
	
	public void addEmp(Emp e) {
		
		e.setEid(101);
		e.setName("Swapnil");
		e.setSalary(10000.22);
		
		Company c=new Company();
		c.displayEMP(e);
		
	}
	
	public void addAllEmp() {
		AllEmp a=new AllEmp();
		a.e1.setEid(101);
		a.e1.setName("jay");
		a.e1.setSalary(2000.11);
		
		a.e2.setEid(102);
		a.e2.setName("Om");
		a.e2.setSalary(2222.22);
		
		Company c=new Company();
		c.displayAllEMP(a);
		
	}

}
