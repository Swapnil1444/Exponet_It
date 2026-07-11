 package com.detatype;

public class DetaTypeEq {

	byte b=127;
	short s=1000;
	int i=123456789;
	long l=12345234;
	
	float f=12.99f;
	double d=1234567.5432234432;
	
	boolean flag=true;
	
	char c='#';
	
	String name="swapnil";
	
	
	public static void main(String[] args) {
	  	
       DetaTypeEq d=new DetaTypeEq();
       System.out.println("byte:"+d.b);
       System.out.println("short:"+d.b);
       System.out.println("int:"+d.i);
       System.out.println("long"+d.i);
       
       System.out.println("float:"+d.f);
       System.out.println("double:"+d.d);
       
       System.out.println("boolean :"+d.flag);
       System.out.println("char:"+d.c);
       
       System.out.println("String:"+d.name);
	}

}
