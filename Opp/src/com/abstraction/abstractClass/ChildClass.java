package com.abstraction.abstractClass;

public class ChildClass extends AbstractClass {

	@Override
	public void m2() {
		System.out.println("Overrided method m2.");

	}

	public static void main(String[] args) {
		
		//AbstractClass a1=new AbstractClass();

		AbstractClass a = new ChildClass();
		System.out.println(a.i);
		a.m1();
		a.m2();

		ChildClass c = new ChildClass();
		System.out.println(c.i);
		c.m1();
		c.m2();

	}

}
