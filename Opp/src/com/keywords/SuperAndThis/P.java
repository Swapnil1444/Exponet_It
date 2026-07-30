package com.keywords.SuperAndThis;

public class P {
	
	public P() {
		this('c');
		System.out.println(888);//2
	}
	public P(char c) {
		System.out.println(777);//1
	}
	public P(int a) {
		this();
		System.out.println(999);//3
	}
	

}
