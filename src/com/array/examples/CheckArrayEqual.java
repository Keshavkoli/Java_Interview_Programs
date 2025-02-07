package com.array.examples;

import java.util.Arrays;

public class CheckArrayEqual {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 1, 2, 1, 4, 5 };
//Approach 1
		boolean result = Arrays.equals(arr1, arr2);
		System.out.println(result);

// Approach 2

		if (result == true) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arryas are Not Equal");
		}

//Approach 3

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					result = false;
				}
			}
		} else {
			result = false;
		}
		if (result == true) {
			System.out.println("Arrays are Equal");
		} else {
			System.out.println("Arryas are Not Equal");
		}
	}
}
