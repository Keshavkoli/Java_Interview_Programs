package com.array.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateNumberInAnArray {

	public static void main(String[] args) {
		Integer arr[] = { 1, 1, 1, 2, 2, 3, 3, 5, 5, 6, 6, 7, 7 };
//Approach 1 for Integer
		HashSet<Integer> hashSet = new HashSet<Integer>(Arrays.asList(arr));
		System.out.println(hashSet);

//Approach 2 for String
		String str[] = { "java", "python", "java", "python", "aws", "aws" };
		HashSet<String> hashstr = new HashSet<String>(Arrays.asList(str));
		System.out.println(hashstr);

//Approach 3 using Java 8 using list of int array
		List<Integer> list = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);
		List<Integer> distIntegers = list.stream().distinct().collect(Collectors.toList());
		System.out.print(distIntegers + " ");
		System.out.println();
		Long disLong = list.stream().distinct().count();
		System.out.println(disLong);
	}
}
