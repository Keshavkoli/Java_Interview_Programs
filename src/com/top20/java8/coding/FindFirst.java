package com.top20.java8.coding;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
//	Write a Java 8 program to find and print the first element in sorted order.
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 3, 2, 4, 7, 5, 6);
		int first = number.stream().findFirst().get();
		System.out.println(first);
	}
}
