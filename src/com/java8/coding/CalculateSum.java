package com.java8.coding;

import java.util.Arrays;
import java.util.List;

public class CalculateSum {
//	 Write a Java 8 program to reduce a list of integers to their sum.
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int add = list.stream().reduce(0, Integer::sum);
		System.out.println(add);
	}
}
