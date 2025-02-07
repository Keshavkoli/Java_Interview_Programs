package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class CountElements {
//	Write a Java 8 program to count and print the number of elements in a list.
	public static void main(String[] args) {
		List<String> list = Arrays.asList("banana", "mango", "grapes", "cherry");
		System.out.println(list.size());
		Long countLong = list.stream().count();
		System.out.println(countLong);

	}
}
