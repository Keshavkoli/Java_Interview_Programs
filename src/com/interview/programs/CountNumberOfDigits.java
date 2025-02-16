package com.interview.programs;

public class CountNumberOfDigits {
//Program to count the number of digits 
	public static void main(String[] args) {
		int num = 123456;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Number Of Digits: " + count);
	}
}
