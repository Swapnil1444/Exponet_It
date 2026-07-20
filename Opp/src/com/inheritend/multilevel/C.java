package com.inheritend.multilevel;

public class C extends B {
	
	int z=300;
	public void m3() {
		System.out.println("M3");
	}

	public static void main(String[] args) {

		System.out.println("****Class A Access Only***");
		A a=new A();
		System.out.println(a.x);
		a.m1();
		
		System.out.println("***Class A+B Access***");
		B b=new B();
		System.out.print(b.x);
		b.m1();
		System.out.println(b.y);
		b.m2();
		
		System.out.println("***Class A+B+C Access:***");
		C c=new C();
		System.out.print(c.x);
		c.m1();
		System.out.println(c.y);
		c.m2();
		System.out.println(c.z);
		c.m3();
		
		
	
		
		
		
		
		
		

	}

}
