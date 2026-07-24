package com.typeCasting;

public class ImplicityExamples {

	public static void main(String[] args) {
		
		//byte>short>char>int>long>flott>double>
		// convart data into small to larg datatype 
		
		byte b=120;
		short s=b;
		System.out.println(s);
		
		int i=s;
		System.out.println(i);
		
		long l=i;
		System.out.println(l);
		
		float f=l;
		System.out.println(f);
		
		double d=f;
		System.out.println(d);
		
		char c='A';
		int i1=c;
		System.out.println(i1);

		long l1=c;
		System.out.println(l1);
		
		float f1=c; 
		System.out.println(f1);
		
		double d1=c;
		System.out.println(d1);
		

	}

}
