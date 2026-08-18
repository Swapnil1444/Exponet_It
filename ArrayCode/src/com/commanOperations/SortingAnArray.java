package com.commanOperations;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {
	
		int []arr= {22,11,23,42,21,23,67,221,11,2345,78};
		System.out.println("Arrays.sort()");
		
		Arrays.sort(arr);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}

	}

}
