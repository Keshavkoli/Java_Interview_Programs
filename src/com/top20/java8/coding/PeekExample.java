package com.top20.java8.coding;

import java.util.Arrays;
import java.util.List;

public class PeekExample {
//	Write a Java 8 program using peek to print processed elements during a stream operation.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		numbers.stream()
		.peek(n -> System.out.println("Processing " + n))
		.map(n -> n * n).forEach(System.out::println);
	}
}
