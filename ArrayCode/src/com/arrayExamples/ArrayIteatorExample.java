package com.arrayExamples;

public class ArrayIteatorExample {

	public static void main(String[] args) {
		
		String []students= {"Swapnil","Om","Prachi","Jay"};

		// 2 way
		System.out.println("====simple array====");
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("====for echa array====");
		for( String name:students) {
			System.out.println(name);
		}
		
	}

}
