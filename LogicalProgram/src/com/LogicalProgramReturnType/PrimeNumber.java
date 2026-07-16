package com.LogicalProgramReturnType;

public class PrimeNumber {

	boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		PrimeNumber p = new PrimeNumber();
		int a = 7;
		if (p.isPrime(a)) {
			System.out.println("Is Prime num:" + a);
		} else {
			System.out.println("Is not prime:" + a);
		}

	}

}
