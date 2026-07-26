package com.accessmodifiar1;

import com.accessModifar.Protected.ProtectedAccessModifar;
import com.accessmodifiar.DefaultTest;

public class demo extends ProtectedAccessModifar

{

	@Override
	protected void m1() {
		// TODO Auto-generated method stub
		super.m1();
		System.out.println("Override method m1.");
	}
	
//	@Override
//	protected void m2() {
//		// TODO Auto-generated method stub
//		super.m2();
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultTest t=new DefaultTest();
//		System.out.println(t.n+" "+t.s);
		//t.m2();
		
		ProtectedAccessModifar p=new ProtectedAccessModifar();
		
		demo d=new demo();
		d.m1();
		d.m2();
		d.name ="Jay";
		System.out.println(d.name);
		
		
		

	}

}
