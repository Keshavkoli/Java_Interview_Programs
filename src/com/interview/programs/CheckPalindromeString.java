package com.interview.programs;

public class CheckPalindromeString {

	public static void main(String[] args) {
		String input = "madam";// original string
		// Approach 1 check String as palindrome
		System.out.println(checkPalindromeString(input));
		// Approach 2 check Number as Palindrome
		int number = 121; // Change this number to test
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}

//Approach 1 check String as palindrome 
	static boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();
// here i will check from reverse side iteration the string is same or not if it is same return true or else false
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;// here i will check if it is true or false if false it will enter
				break;
			}
		}

		return result;
	}

//Approach 2 check Number as Palindrome
	static boolean isPalindrome(int num) {
		int original = num;
		int reverse = 0;

		while (num > 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num /= 10;
		}

		return original == reverse;
	}
}
