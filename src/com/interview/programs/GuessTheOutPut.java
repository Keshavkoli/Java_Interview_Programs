package com.interview.programs;

public class GuessTheOutPut {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");

		System.out.println("s1 == s2 is:" + s1 == s2);// == operator does Address comparsion
		System.out.println(s1.equals(s2));// .equals() method does content comparsion
	}
}
