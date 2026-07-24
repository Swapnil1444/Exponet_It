package com.covariantReturnType;

public class CovariantReturnType {
	
	public static void main(String[] args) {
		
		ClassA a=new ClassB();
		
		System.out.println(a+"\n"+a.id+" "+a.name);
		a.display();
		
		//ClassB b=new ClassB();
		
	    ClassB b=(ClassB)a.getObject(); 
	    b.display();
		System.out.println(b+" \n"+b.age+" "+b.id+" "+b.name);
		
	}

}
