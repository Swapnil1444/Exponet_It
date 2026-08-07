package com.abstraction.Interface;

public class ClassMain implements I3 {

	
	public static void main(String[] args) {
		
		I1 i1=new ClassMain();
		i1.show();
		System.out.println("-------------");
		
		I2 i2=new ClassMain();
		i2.show();
		i2.show("Heloo");
		System.out.println("-------------");
		
		I3 i3=new ClassMain();
		i3.show();
		i3.show("I3 Pass ");

	}

	@Override
	public void show() {
		
		System.out.println("Show Method");
	}

	@Override
	public void show(String msg) {
		System.out.println("Show method :"+msg);
		
	}

}
