package com.interview.programs;

import java.util.Random;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {

		// Approach 1 - Random
		Random rand = new Random();
		int rand_int = rand.nextInt(1000);
		System.out.println(rand_int);
//Approach 2 for double 
		double rand_dbl = rand.nextDouble();
		System.out.println(rand_dbl);

		// Approach 3 Apache commons - lang API
		// http:///commons.apache.org/
//Generate random String 
		// Generate Random Alphabetical
		// https://www.youtube.com/watch?v=PXtJtJZdsbU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=12
	}
}
