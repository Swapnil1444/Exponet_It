package com.keywords.static_keyword;

public class StaticNestedClass {

	static {
		System.out.println("Static block1");
	}
	static class InnerClass{
		
		static {
			System.out.println("Static block 2");
		}
		
		public static void m1() {
			System.out.println("Display m1");
			
//			static { //no write inside method 
//				
//			}
		}
	}
	
	public void m2() {
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		
		StaticNestedClass s=new StaticNestedClass();
		s.m2();
		
		StaticNestedClass.InnerClass i=new StaticNestedClass.InnerClass();
		i.m1();
        InnerClass.m1();
	}

}
