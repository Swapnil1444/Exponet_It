package com.accessmodifiar;

public class DefaultTest {
	
	String s="swapnil";
	int n=11;
	
	void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
		
	DefaultTest t=new DefaultTest();
	System.out.println(t.n+" "+t.s);
	t.m2();
	
	

	}

}
