package com.returnType;

public class Dept {

	public Emp addEmp() {
		Emp e=new Emp();
		
		e.eName="om";
		e.age=21;
		e.salary=2220.22;
		
		return e;
	}
	
	public AllEmp allEmpDetails() {
		AllEmp a=new AllEmp();
		
		a.nayan.eName="nayan";
		a.nayan.age=22;
		a.nayan.salary=2222.22;
		
		a.omkar.age=21;
		a.omkar.salary=20000.2;
		a.omkar.eName="Omkar";
		
		a.vijay.age=28;
		a.vijay.eName="Vijay";
		a.vijay.salary=30000000.33;
		
		a.prachi.age=19;
		a.prachi.eName="Prachi";
		a.prachi.salary=2000.22;
		
		return a;
	}
}
