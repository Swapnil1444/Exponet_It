package com.keywords.static_keyword;

public class StaticMethod {

	public static int add(final int a,final int b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(10,20));
		
		StaticNestedClass.InnerClass.m1();
		StaticNestedClass.main(args);//call main method on this class StaticNestedClass

	}

}
