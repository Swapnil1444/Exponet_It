package com.LogicalProgramReturnType;

public class Factorial {
	
	public long factorialNumber(int n) {
	
		long fact=1;
		
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		
		
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f=new Factorial();
		int n=10;
		System.out.println("Factoral Number of "+n+" in "+f.factorialNumber(n)+"!");

		System.out.println("*********");
		for(int i=1;i<=10;i++) {
			
			System.out.println(i+" factoral is: "+f.factorialNumber(i));
			
		}
		
	}

}
