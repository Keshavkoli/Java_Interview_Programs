package com.collection.map.examples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap();
		map.put("B", 26);
		map.put("C", 23);
		map.put("A", 21);
		map.put("D", null);
		map.put("H", null);
		map.put("H", null);
//		map.put(null, 25);
		System.out.println(map);
	}

}
//we can have duplicates values but duplicate keys are not allowed it will just replace the latest key 
//we can have multiple null values but cannot have single null key if we try it will throw error saying(Exception in thread "main" java.lang.NullPointerException)
// Insertion order is not preserved