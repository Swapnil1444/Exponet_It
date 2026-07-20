package com.LogicalProgramReturnType;

public class ReversNumber {
	
	public void reversNumber(int n) {
		
		int rev;
		
		while(n>0) {
			rev=n%10;
			System.out.print(rev);
			n=n/10;
		}
		
		//return rev;
	}

	public static void main(String[] args) {
	
		ReversNumber r=new ReversNumber();
		//System.out.println(r.reversNumber(1234));
		r.reversNumber(123);

	}

}
