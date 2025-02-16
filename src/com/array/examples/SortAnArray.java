package com.array.examples;

import java.util.Arrays;

public class SortAnArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, -1, -2, 4 };
//Approach 1 sorting an array using a for loop
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = 0;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

			System.out.print(array[i] + " ");
		}
		System.out.println();
// Approach 2 to sort an array with inbuild methods
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
