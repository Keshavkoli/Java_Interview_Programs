package com.array.examples;

import java.util.HashMap;
import java.util.Map;

public class EachCharacterCountInArray {

	public static void main(String[] args) {
		String string = "abcdABCDabcd";

		char[] ch = string.toCharArray();
		Map<Character, Integer> count = new HashMap<>();

		for (char c : ch) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}
		}
		System.out.println(count);

	}
}
