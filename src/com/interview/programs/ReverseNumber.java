package com.interview.programs;

public class ReverseNumber {

	public static void main(String[] args) {

		int number = 54321;
		// Approach 1 Using the StringBuffer reverse Method
		StringBuffer sBuffer = new StringBuffer(String.valueOf(number));
		StringBuffer revBuffer = sBuffer.reverse();
		System.out.println("Reverse Number Using StringBuffer " + revBuffer);

		// Approach 2 Using the StringBuilder
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append(number);
		StringBuilder revBuilder = sBuilder.reverse();
		System.out.println("Reverse Number Using StringBuilder " + revBuilder);
		// Approach 3
		reverseNumber(number);
	}

	static void reverseNumber(int number) {
		int reverse = 0;

		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reverse Number Using " + reverse);
	}
}
