package com.collection.set.exmple2;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student s1=new Student(1, "swapnil");
		Student s2=new Student(1, "swapnil");
		
		Set<Student> set=new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		System.out.println(set);
		System.out.println(set.size());
		
	}

	
	
	
}
