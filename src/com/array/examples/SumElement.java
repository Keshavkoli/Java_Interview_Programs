package com.array.examples;

public class SumElement {
	public static void main(String[] args) {
		// Approach 1 Count number sum of digits
		int arr[] = { 5, 2, 7, 9, 6 };
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("Sum of Digits in a Number :" + sum);

		// Approach 2 check from integer number
		int num = 12345;
		int sum1 = 0;
		while (num > 0) {
			sum1 = sum1 + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of Digits in a Number :" + sum1);

	}
}
