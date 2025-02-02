package com.top20.java8.coding;

import java.util.Arrays;
import java.util.List;

//Write a Java 8 program using flatMap to print characters from lists of strings.
public class FlatMapExample {
	public static void main(String[] args) {
		List<List<String>> list = Arrays.asList(
                Arrays.asList("apple", "mango"),
                Arrays.asList("banana", "grapes"));
        list.stream()
            .flatMap(List::stream)
            .forEach(System.out::println); 
	}
}
