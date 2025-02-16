package com.interview.programs;

public class PrintFibonacci {
//	A Fibonacci sequence is one in which each number is the sum of the two previous numbers.
	// we will use the for loop for this
	public static void main(String[] args) {
		int count = 10;
		printFibonica(count);
	}

	static void printFibonica(int count) {
		int a = 0;
		int b = 1;
		int c = 1;
		for (int i = 0; i <= count; i++) {
			System.out.print(a + " , ");

			a = b;
			b = c;
			c = a + b;
		}
	}
}
