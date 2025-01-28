package com.java.interview.programs;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateNumberInAnArray {

	public static void main(String[] args) {
		Integer arr[] = { 1, 1, 1, 2, 2, 3, 3, 5, 5, 6, 6, 7, 7, 8, 9, 9, 9, 9, 10, 10, 11, 11 };
		HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(arr));
		System.out.println(hashSet);
	}
}
