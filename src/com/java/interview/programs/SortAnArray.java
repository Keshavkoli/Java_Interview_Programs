package com.java.interview.programs;

import java.util.Arrays;

public class SortAnArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, -1, -2, 4 };

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
		// another way to sort an array
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
