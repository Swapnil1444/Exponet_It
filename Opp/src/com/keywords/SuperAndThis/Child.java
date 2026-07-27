package com.keywords.SuperAndThis;

public class Child extends Parent {

	int iphone = 18;

	@Override
	public void m1() {
		System.out.println("Child class method m1");
	}

	public void m3(int iphone) {

		// super.iphone=this.iphone;

		super.m1();
		this.m2();
		System.out.println("M3 method child class");
		System.out.println(this.iphone);
		System.out.println(super.iphone);
		System.out.print(iphone);
	}

	public static void main(String[] args) {

		Child c = new Child();
		c.m1();
		c.m3(22);

	}

}
