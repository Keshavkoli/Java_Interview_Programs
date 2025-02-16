package com.string.example;

public class RemoveJunkorSpecialCharactersinString {

	public static void main(String[] args) {

		String str = "Hello@# World!! 123$%";
		String cleanedStr = str.replaceAll("[^a-zA-Z0-9 ]", ""); // Removes special characters except space
		System.out.println("Cleaned String: " + cleanedStr);
	}
}
