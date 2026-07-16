package com.accessmodifiar;

public class PrivateTest {

	private int id = 102;
	private String name = "jay";

	private PrivateTest() {}

	private void m1() {
		System.out.println("M1");
	}

	public static void main(String[] args) {

		PrivateTest p=new PrivateTest();
		System.out.println(p.id);
		System.out.println(p.name);
		p.m1();

	}

}
