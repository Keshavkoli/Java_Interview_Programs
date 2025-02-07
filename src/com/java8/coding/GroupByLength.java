package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
//	Write a Java 8 program to group strings by their lengths and print the groups.
	public static void main(String[] args) {

		List<String> words = Arrays.asList("a", "bb", "ccc", "dd");
		Map<Integer, List<String>> groupedMap = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupedMap);
	}
}
