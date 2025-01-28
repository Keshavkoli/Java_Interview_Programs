package com.java.interview.programs;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Keshav";
		String reverseString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reverseString = ch + reverseString;
		}

		System.out.println(reverseString);
	}
}
