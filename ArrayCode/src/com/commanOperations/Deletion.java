package com.commanOperations;

public class Deletion {

	public static void main(String[] args) {
		
		int arr[]= {20,11,22,333,44};
		
		int index=2;
		
		for(int i=index;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		for (int i = 0; i < arr.length-1; i++) {
		System.out.println(arr[i]);	
		}

	}

}
