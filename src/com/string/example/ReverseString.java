package com.string.example;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.nextLine();
		reverseString(str);
		reverseString2(str);
		reverseUsingStringBuffer(str);
	}

//Approach 1 Using the charAt(i) method
	static void reverseString(String str) {
		String reverseString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reverseString = ch + reverseString;
		}

		System.out.println(reverseString);
	}

//Approach 2 Using the character array method
	static void reverseString2(String str) {
		char a[] = str.toCharArray();
		String reverseString = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			reverseString = reverseString + a[i];
		}
		System.out.println(reverseString);
	}

	// Approach 3 Using the StringBuffer Class
	static void reverseUsingStringBuffer(String str) {
		StringBuffer sBuffer = new StringBuffer(str);
		StringBuffer reBuffer = sBuffer.reverse();
		System.out.println(reBuffer);
	}
}
