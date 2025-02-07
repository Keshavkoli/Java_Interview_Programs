package com.interview.programs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String input = "my name is Kartik";
		System.out.println(removeWhiteSpaces(input));
		String myStr = "       Hello World!       ";
		// trim() method Removes whitespace from both sides of a string
		System.out.println(myStr.trim());

		String s = "  abc  def\t";

		s = s.trim();

		System.out.println(s);
	}

	static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();

		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}

		return output.toString();
	}
}
