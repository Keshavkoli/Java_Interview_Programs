package com.array.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoListInJava {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple", "mango", "grapes", "cherry");
		System.out.println(list1);
		List<String> list2 = Arrays.asList("kiwi", "bitroot", "banana", "chips");
		System.out.println(list2);
		List<String> merList = new ArrayList<String>(list1);
		merList.addAll(list2);
		System.out.println(merList);
	}
}
