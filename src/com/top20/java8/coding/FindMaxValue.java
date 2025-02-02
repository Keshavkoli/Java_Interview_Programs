package com.top20.java8.coding;

import java.util.Arrays;
import java.util.List;

public class FindMaxValue {
//	Write a Java 8 program to find and print the maximum value from a list.
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int max = numbers.stream().max(Integer::compare).get();
		System.out.println(max);
	}

}
