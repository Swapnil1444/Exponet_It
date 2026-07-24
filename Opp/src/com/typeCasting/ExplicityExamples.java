package com.typeCasting;

public class ExplicityExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double>float>long>int>char>short>byte
		//covart larg to small but data loss 
		
		double d=100000000000.10;
		float f=(float)d;
		System.out.println(f);
		
		f=1000.10f;
		long l=(long)f;
		System.out.println(l);
		
		int i=(int)l;
		System.out.println(i);
		
		short s=(short)i;
		System.out.println(s);
		
		byte b=(byte)s;
		System.out.println(b);
		
		
		char c=(char)i; 
		System.out.println(c);
		
		

	}

}
