package com.top20.java8.coding;

import java.util.Arrays;
import java.util.List;

public class DistinctElements {
//	Write a Java 8 program to print distinct elements from a list of integers.
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 1, 2, 3, 4, 5, 4, 6);
		list.stream().distinct().forEach(System.out::println);
	}
}
