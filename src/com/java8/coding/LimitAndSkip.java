package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {
//	Write a Java 8 program to limit and skip elements in a list, then print.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List skipList = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(skipList);

	}
}
