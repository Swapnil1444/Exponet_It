package com.keywords.static_keyword;

public class StaticAndNon {

	int id = 10;
	String name = "swapnil";
	static String CollogeName = "DYPT";

	public void m1() {
	//	static int i1=10;
		System.out.println("Non Static method.");
		System.out.println(id + " " + name + " " + CollogeName);
	}

	public static void m2() {
	//	static int i1=10;
		System.out.println(" Static method.");
		StaticAndNon s = new StaticAndNon();

		System.out.println(s.id + " " + s.name + " " + CollogeName);
		s.m1();
	}

	public static void main(String[] args) {
		System.out.println("===Main method===");
		m2();
	}
	{
		System.out.println("===non Static Block===");
	}
	static {
		System.out.println("===Static Block===");
	}

}
