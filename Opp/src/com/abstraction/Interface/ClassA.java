package com.abstraction.Interface;

public class ClassA implements InterfaceI{

	public static void main(String[] args) {
	
		InterfaceI i=new ClassA();
		i.m1();
		i.m2();
		System.out.println("N1:"+n1+" N2:"+n2+"\n");
		
		ClassA a=new ClassA();
		a.m1();
		a.m2();
		a.m3();
		System.out.println("N1:"+n1+" N2:"+n2);
		

	}

	@Override
	public void m1() {
		System.out.println("M1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("M2 Method");
		
	}
	public void m3() {
		System.out.println("m3 method");
	}

}
