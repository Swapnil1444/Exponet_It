package com.keywords.SuperAndThis;

public class Q extends P{

	
	public Q() {
		this(10.1,"Swapnil");
		System.out.println("111");//5
	}
	public Q(int i,int j) {
		this(true,'a');
		System.out.println("222");//7
	}
	public Q(double d,String s) {
		super(10);
		System.out.println("333");//4
	}
	public Q(char c) {
		this(10,20);
		System.out.println("444");//8
	}
	public Q(boolean b,char c) {
		this();
		System.out.println("555");//6
	}

	public static void main(String[] args) {
		new Q('c');
		System.out.println("===Main Method===");//9

	}

}
