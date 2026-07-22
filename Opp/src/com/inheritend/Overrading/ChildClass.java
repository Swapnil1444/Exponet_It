package com.inheritend.Overrading;

public class ChildClass extends ParantCLass{
	
	@Override
	public void m1() {
		System.out.println("Override method in parent class");
		
	}
	public void m3(){
		System.out.println("M3 child class method");
	}

	public static void main(String[] args) {
		
		System.out.println(" \n Class Parent crating object");
		ParantCLass p=new ParantCLass();
		p.m1();
		p.m2();
		
		System.out.println("\n Class parent but crate constractar in child class");
		ParantCLass pc=new ChildClass();
		pc.m1();
		pc.m2();
		
		System.out.println("\n class child crate object");
		ChildClass c=new ChildClass();
		c.m1();
		c.m2();
		c.m3();
		
		
		
		

	}

}
