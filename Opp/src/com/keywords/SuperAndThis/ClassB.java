package com.keywords.SuperAndThis;

public class ClassB extends ClassA{
	
	int id;
	public ClassB(){
		super(10,20);
		System.out.println("Class B default constr");
	}

	public ClassB(int id) {
		this();
		
		this.id=id;
	}
	
	@Override
	public String toString() {
		return "Id:"+id;
	}
	public static void main(String[] args) {
		

		ClassB b=new ClassB(10);
		System.out.println(b);
		
		
	}

}
