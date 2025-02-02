package com.top20.java8.coding;

import java.util.Optional;

public class OptionalExample {
//	Write a Java 8 program using Optional to check if a value is present.
	public static void main(String[] args) {
		Optional<String> name = Optional.of("Java");
		name.ifPresent(System.out::println);
	}
}
