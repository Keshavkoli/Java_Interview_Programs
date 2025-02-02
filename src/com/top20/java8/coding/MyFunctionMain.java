package com.top20.java8.coding;

public class MyFunctionMain {
//	 Write a Java 8 program to create a custom functional interface for addition.
	public static void main(String[] args) {
		MyFunction addFunction = (a, b) -> a + b;
		System.out.println(addFunction.apply(10, 20));
	}
}
