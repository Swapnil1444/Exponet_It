package com.LogicalProgramReturnType;

public class LargestNum {

	public int largestNumber(int a, int b) {
		if (a > b) {
			return a;
		} else
			return b;
	}

	public static void main(String[] args) {

		LargestNum l = new LargestNum();
		System.out.println("Largest Number:"+l.largestNumber(10, 20));

	}

}
