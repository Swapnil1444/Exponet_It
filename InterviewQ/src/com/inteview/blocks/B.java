package com.inteview.blocks;

public class B {
	A a=new A();
	public B() {
		System.out.println("B Constractar.");//8
	}
	static {
		System.out.println("Static block B");//2
	}
	{
		System.out.println("non Static block B");//5
		A a=new A();
	}

}
