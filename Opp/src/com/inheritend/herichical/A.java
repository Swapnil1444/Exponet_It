package com.inheritend.herichical;

public class A extends Parent {
	int x=10;
	public void m1() {
		
		System.out.println("M1 method");
	}
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.x);
		a.m1();
		System.out.println(a.z);
		a.m3();
	}

}
