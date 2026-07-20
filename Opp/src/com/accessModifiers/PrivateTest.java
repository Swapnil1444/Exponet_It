package com.accessModifiers;

public class PrivateTest {
	
	 int x=3;
	public PrivateTest() {
		// TODO Auto-generated constructor stub
		x++;
	}
	public static void main(String[] args) {
		new PrivateTest();
		new PrivateTest();
		PrivateTest p=new PrivateTest();
		System.out.println(p.x);
	}
	
	

}
