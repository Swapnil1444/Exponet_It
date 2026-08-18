package com.commanOperations;

public class MaximumElement {

	public static void main(String[] args) {
		
		int [] arr= {20,11,23,44,67,5432,2345,5422,3,345,66};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		

	}

}
