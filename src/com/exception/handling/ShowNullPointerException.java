package com.exception.handling;

public class ShowNullPointerException {

	public static void main(String[] args) {
		String str = null;
		showNullPointer(str);
	}

	static void showNullPointer(String str) {
		System.out.println(str.toLowerCase());
	}
}
