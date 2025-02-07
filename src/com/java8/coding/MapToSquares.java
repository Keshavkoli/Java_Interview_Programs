package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class MapToSquares {
//	 Write a Java 8 program to map integers to their squares and print results.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		numbers.stream().map(n -> n * n).forEach(System.out::println); // Output: 1 4 9 16
	}
}
