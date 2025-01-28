package com.java.interview.programs;

public class CheckPalindrome {

	public static void main(String[] args) {
		String input = "Keshav";
		System.out.println(checkPalindromeString(input));
	}

	static boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();
		System.out.println(length);

		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}

		return result;
	}
}
