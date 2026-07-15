package com.method.calculator;

public class Calculator {
	
	public int add(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public int sub(int a,int b) {
		int sub=a-b;
		return sub;
	}
	public double div(int i,int j) {
		 double div=i/j;
		 return div;
	}
	public int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}

	public static void main(String[] args) {
		
		Calculator c=new Calculator();
		int sum=c.add(10, 20);
		System.out.println(sum);
		
		int sub=c.sub(10, 20);
		System.out.println(sub);
		
		double div=c.div(11, 11);
		System.out.println(div);
		
		int mul=c.mul(10, 10);
		System.out.println(mul);
		
		
		
		

	}

}
