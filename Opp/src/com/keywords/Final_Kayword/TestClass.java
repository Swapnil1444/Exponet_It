package com.keywords.Final_Kayword;

public class TestClass // extends FinalKayWordExample
{

//	@Override
	//// public void display() { / System.out.println("display method 2"); /

	public int add(final int a, final int b) { // local varibale
		// a=49;
		return (a + b);
	}

	public static void main(String[] args) {

		final FinalKayWordExample f = new FinalKayWordExample();
		// f.name="jay";
		System.out.println(f.name);
		f.display();
		f.i = 10;

		System.out.println(f.i);
		System.out.println(f.age);

		// f=new FinalKayWordExample();

		TestClass t = new TestClass();
		System.out.println("sum" + t.add(10, 20));
//		System.out.println(t.name);
//		t.display();

	}

}
