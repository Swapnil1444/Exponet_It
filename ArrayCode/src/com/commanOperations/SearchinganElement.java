package com.commanOperations;

public class SearchinganElement {

	public static void main(String[] args) {
		
		int arr[]= {20,10,22,11,22,23};
		
		int search=23;
	
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found=true;
			}
		}
		
		System.out.println(found);

	}

}
