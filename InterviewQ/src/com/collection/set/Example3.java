package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(19);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		System.out.println(list.size());
		
		Set<Integer> set=new HashSet<Integer>(list);
		//set.add();
		System.out.println(set);
		
		Set<Integer> set1 =new LinkedHashSet<Integer>(list);
		System.out.println(set1);
		
		Set<Integer> set2=new TreeSet<Integer>(list);
		System.out.println(set2);

	}

}
