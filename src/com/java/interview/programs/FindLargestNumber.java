package com.java.interview.programs;

public class FindLargestNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 33, 99, 10, 11, 77, 101, 98 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
