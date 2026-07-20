package com.inheritend.herichical;

public class B  extends Parent{
	int y=20;
	public void m2() {
		System.out.println("M2");
	}
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.y);
		b.m2();
		System.out.println(b.z);
		b.m3();
	}

}
