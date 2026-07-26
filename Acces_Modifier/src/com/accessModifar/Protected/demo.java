package com.accessModifar.Protected;

public class demo extends ProtectedAccessModifar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedAccessModifar  p=new ProtectedAccessModifar();
		p.m1();
		
		ProtectedAccessModifar  p1=new demo();
		p1.m1();
		
		demo d=new demo();
		d.m1();
	}

}
