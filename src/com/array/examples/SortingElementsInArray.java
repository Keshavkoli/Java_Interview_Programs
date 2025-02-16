package com.array.examples;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsInArray {

	public static void main(String[] args) {

		// Approach 1
		int a[] = { 30, 50, 20, 10, 60 };
		System.out.println("Arrays Elements before Sorting :" + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Arrays elements After sorting :" + Arrays.toString(a));

		// Approach 2
		int b[] = { 90, 40, 30, 60, 60 };
		System.out.println("Arrays Elements before Sorting :" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Arrays elements After sorting :" + Arrays.toString(b));

		// Approach 3 in Descending order
		Integer c[] = { 10, 20, 30, 40, 50 };
		System.out.println("Arrays Elements before Sorting :" + Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println("Arrays elements After sorting :" + Arrays.toString(c));
	}
}
