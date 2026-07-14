package com.staticblock;

public class StaticDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");
		StaticDemo s=new StaticDemo();
		
		System.out.println("main method-1");
		
		StaticDemo s1=new StaticDemo(); 
		

	}
	
	public StaticDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("Constractar"); 
	}
	
	//static block
	static 
	{
		System.out.println("static block");
		StaticDemo s1=new StaticDemo(); 
		
		
	}
	
	//non static block
	{
	//	StaticDemo s1=new StaticDemo(); // error stackoverflow occer
		System.out.println("non static block");
	}

}
