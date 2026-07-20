package com.inteview.blocks;

public class A {

	//B b=new B();

	static {
		System.out.println("Static Block A");//1
	}
	{
		System.out.println("Non Static Block A");//3//6
		//B b=new B(); //infinity
	}
	public A() {
		System.out.println("A Constr.");//4//7
	}
	public static void main(String []args) {
		//A a =new A();
		B b=new B();
	}
}
