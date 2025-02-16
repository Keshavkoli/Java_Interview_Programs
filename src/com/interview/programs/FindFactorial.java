package com.interview.programs;

public class FindFactorial {

	public static void main(String[] args) {
		int number = 5;
		System.out.println(factorial(number));
		factorial2(number);
	}

//Approach 1
	static long factorial(long number) {
		if (number == 1)
			return 1;
		else
			return (number * factorial(number - 1));
		// 5*4*3*2*1
	}

//Approach 2
	static void factorial2(long number) {
		long factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a Number is " + factorial);
	}

}
