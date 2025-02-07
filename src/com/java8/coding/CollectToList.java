package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToList {
//	Write a Java 8 program to collect squares of numbers into a new list.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3);
		List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println(squares);
	}
}
