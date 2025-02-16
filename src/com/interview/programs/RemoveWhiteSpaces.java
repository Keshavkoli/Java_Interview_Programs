package com.interview.programs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String input = "my name is Kartik";
		System.out.println(removeWhiteSpaces(input));
		String myStr = "       Hello World!       ";
		// trim() method Removes whitespace from both sides of a string
		System.out.println(myStr.trim());

//Approach 2 for Removing white spaces  from String
		String input2 = "my name is Kartik";
		String removeWhiteSpace = input2.replace(" ", "");
		System.out.println(removeWhiteSpace);//output- mynameisKartik

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
