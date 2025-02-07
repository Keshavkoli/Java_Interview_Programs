package com.interview.programs;

public class CheckVewols {

	public static void main(String[] args) {
		String str = "Keshav";
		System.out.println(checkvewols(str));
	}

	static boolean checkvewols(String str) {
		return str.toLowerCase().matches(".*[aeiou]*.");
	}
}
