package com.interview.programs;

public class CountEvenOddDigits {

	public static void main(String[] args) {
		int number = 123456789; // Change this number to test
		countEvenOdd(number);
	}

	static void countEvenOdd(int num) {
		int evenCount = 0, oddCount = 0;

		while (num > 0) {
			int digit = num % 10; // Extract last digit
			if (digit % 2 == 0) {
				evenCount++; // Increment even count
			} else {
				oddCount++; // Increment odd count
			}
			num /= 10; // Remove last digit
		}

		System.out.println("Even digits: " + evenCount);
		System.out.println("Odd digits: " + oddCount);
	}
}
