package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class PrintLengths {
//	 Write a Java 8 program to print the lengths of strings in a list.
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Python", "JavaScript");
		words.forEach(word -> System.out.println(word.length()));
	}

}
