package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
		
		String s1="swapnil";
		String s2=new String("swapnil");
		String s3="swap";
		String s4=s3+"nil";
		String s5="Swapnil";
		
		
		Set<String> s=new HashSet<String>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		System.out.println(s);
		System.out.println(s.size());
	}

}
