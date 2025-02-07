package com.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java 8 program to filter and print even numbers from a list.
public class FilterEvenNumbers {
	public static void main(String[] args) {
		//Approach 1 using the forloop 
		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}

		}
		System.out.println();
		//Approach 2 using the java 8 features
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(list2);
		System.out.println();
		//Approach 3 using java 8
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println); // Output: 2 4 6
        
        List<Integer> numbers2 = Arrays.asList(1, 2, 3);
        boolean haseven = numbers2.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(haseven); // Output: true
	}
}
