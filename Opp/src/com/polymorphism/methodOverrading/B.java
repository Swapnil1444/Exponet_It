package com.polymorphism.methodOverrading;

public class B extends A{
	
	//rules
	@Override
	public void add() {
		System.out.println("Overrided method m1");
		
	}
	//@Override - not a overrided method in static 
	public static void m1() {
		System.out.println("Static method in B class .");
	}
	

	public static void main(String[] args) {
		
		//how to verify method is overrided or not: crateing mix obj
		A a=new A();
		a.add(); //call overrided method 
		a.m1(); // check static overrided 
		
		A.m1();
		B.m1();
		
		

	}

}
