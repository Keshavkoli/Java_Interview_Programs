package com.interview.programs;

import java.util.Random;

public class GenerateRandomNumberAndStrings {

	public static void main(String[] args) {

		// APPROACH 1 - Generate Random Number
		Random random = new Random();
		int rand_int = random.nextInt(10);// it will generate random numbers
		System.out.println(rand_int);
		System.out.println();
		// APPROACH 2 - Generate Random Number
		double rand_dbl = random.nextDouble();
		System.out.println(rand_dbl);

		// Approach 3 Math
		System.out.println(Math.random());
	}
}
