package com.interview.programs;

public class CheckOddOrEven {

	public static void main(String[] args) {
//Approach 1 with for loop arr[] of integer
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Even Numbers ");
		for (int i = 0; i <= arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Odd Numbers ");
		for (int i = 0; i <= arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
//Approach 2 check for the single value

	}
}
