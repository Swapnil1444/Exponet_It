package com.covariantReturnType;

public class ClassB extends ClassA {
	
	int age=21;

	@Override
	ClassA getObject() {
		return new ClassB();
	}
	
	
	@Override
	public String toString() {
		return "Class B Object";
	}

}
