package com.java.interview.programs;

public class FindFactorial {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));
	}

	static long factorial(long n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
		// 5*4*3*2*1

	}
}
