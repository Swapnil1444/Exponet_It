package com.inheritend.singleInher;

public class ClassB extends ClassA {
	
	int y=200;
	public void m2() {
		System.out.println("M2");
	}
	
	public static void main(String[] args) {
		
	ClassB b=new ClassB();
	
	System.out.println("***Access A class Proparties***");
	System.out.println("x:"+b.x);
	b.m1();
	
	System.out.println("***Access B class Proparties");
	System.out.println("x:"+b.y);
	b.m2();
	
		
		
	}

}
