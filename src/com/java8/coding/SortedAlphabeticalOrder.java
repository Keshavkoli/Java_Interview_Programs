package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class SortedAlphabeticalOrder {
//	 Write a Java 8 program to print names sorted in alphabetical order from a list.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("mango", "grapes", "apple", "chicku");
		strings.stream().sorted().forEach(System.out::println);
	}
}
