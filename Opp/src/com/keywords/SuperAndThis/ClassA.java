package com.keywords.SuperAndThis;

public class ClassA {

	public ClassA(){
		System.out.println("Class A default constr.");
	}
	
	public ClassA(int a,int b) {
		this();
		System.out.println("Class A parameter constr "+a+" "+b);
	}
}
