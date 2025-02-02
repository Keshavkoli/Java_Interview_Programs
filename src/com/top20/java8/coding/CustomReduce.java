package com.top20.java8.coding;

import java.util.Arrays;
import java.util.List;

//Write a Java 8 program using reduce to calculate the product of a list.
public class CustomReduce {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		int prod = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(prod);
	}
}
