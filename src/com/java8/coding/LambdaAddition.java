package com.java8.coding;

public class LambdaAddition implements LambdaInterface {

	public static void main(String[] args) {
		LambdaAddition ld = new LambdaAddition();
		System.out.println(ld.add(10, 20));
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}
}
