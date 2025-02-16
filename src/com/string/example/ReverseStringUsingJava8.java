package com.string.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseStringUsingJava8 {

	public static void main(String[] args) {
		String str = "Hello World";
		String reversed = IntStream.range(0, str.length()).mapToObj(i -> str.charAt(str.length() - i - 1))
				.map(String::valueOf).collect(Collectors.joining());
		System.out.println("Reversed String: " + reversed);
	}
}
