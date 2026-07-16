package com.LogicalProgramReturnType;

public class EvenOdd {
	
	public boolean checkEvenOdd(int a) {
		return a%2==0;
	}

	public static void main(String[] args) {
		EvenOdd e=new EvenOdd();
		int i=10;
		System.out.println("Check Even or odd:");
		if(e.checkEvenOdd(i)) {
			System.out.println("Even:"+i);
		}
		else {
			System.out.println("Odd:"+i);
		}

	}

}
