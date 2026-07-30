package com.polymorphism.methodOverloding;

public class demo {
	
	
	public void m1() {
		System.out.println("defalut method.");
	}
	public void m1(int a) {
		System.out.println("int parametar method. ");
	}
	public void m1(String s) { 
		
		System.out.println("String parameter method.");
	}
	public void m1(Object o) {
		System.out.println("Object class para method.");
	}

	//rules:
	public final static void m2() {
		System.out.println("Static method m2.");
	}
	public void m2(int i) {
		System.out.println("no retuen any m2 method ."+i);
	}
	private void m2(String j) {
		System.out.println("Private method m2 "+j);
	}
	int m2(int a,int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		demo d=new demo();
		d.m1(null);
		d.m1(10);
		d.m1(new Object());
		d.m1();
		
		m2();
		d.m2(0);
		d.m2("Swapnil");
		System.out.print(d.m2(10, 20));

		
	}

}
