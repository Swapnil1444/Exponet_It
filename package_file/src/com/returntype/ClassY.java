package com.returntype;

public class ClassY {
	
	int i,j=20,k=30;
	
	public ClassY m2() {
		ClassY y1=new ClassY();
		System.out.println(y1.i+" "+y1.j+" "+y1.k);//0,20,30
	
		ClassY y2=new ClassY();
		y2.i=100;
		y2.j=200;
		System.out.println(y2.i+" "+y2.j+" "+y2.k);
		
		
		
		
		ClassY y3=new ClassY();
		y3.i=y1.k;
		y3.j=y2.i;
		
		y3.k=900;
		System.out.println(y3.i+" "+y3.j+" "+y3.k);
		
		int i=100;
		int j=200;
		int k=300;
		ClassY y4=new ClassY();
		y4.i=k;
		y4.j=j;
		y4.k=800;
		System.out.println(y4.i+" "+y4.j+" "+y4.k);
		
		ClassY y5=new ClassY();
		return y4;
		
		
	}

	public static void main(String[] args) {
		ClassY y=new ClassY();
		System.out.println(y.i+" "+y.j+" "+y.k);
		ClassY y1=y.m2();
		System.out.println(y1.i+" "+y1.j+" "+y1.k);
		
		
		

	}

}
