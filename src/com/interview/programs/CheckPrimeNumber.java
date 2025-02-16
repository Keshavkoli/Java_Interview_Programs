package com.interview.programs;

public class CheckPrimeNumber {
//	a number that can be divided exactly only by itself and 1, for example 7, 17 and 41 are prime number
	public static void main(String[] args) {
		int n = 7;
		System.out.println(checkPrime(n));
	}

	// given number n, by a number from 2 to n/2 and check the remainder. If the
	// remainder is 0, then it’s not a prime number.

	static boolean checkPrime(int n) {

		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}

		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
