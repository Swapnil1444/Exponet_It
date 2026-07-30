package com.inteview.Ajay;

public class DemoAjay {

	static int i=m1();
	
	static {
		System.out.println("Static method.");
	}

	public static int m1() {
		System.out.println("m1 method call .");
		return 10;
	}

	public static void m2() {
		System.out.println("m2 method");
	}

	public static void main(String[] arges) {
		System.out.println("Mein method");
		m2();
		System.out.println(i);
	}

}
