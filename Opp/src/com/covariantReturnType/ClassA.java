package com.covariantReturnType;

public class ClassA {
	
	int id=20;
	String name="swapnil";
	
  	ClassA getObject() {
		return new ClassA(); //return object
	}
	
	public void  display() {
		System.out.println("Class A Display method call");
	}
	
	@Override
	public String toString() {
		return "Class A Object";
	}

}
