package com.interview.programs;

public class SwapNumber {
//4 Ways of swapping Numbers
	public static void main(String[] args) {
//Approach 1 
		swapApproach1();
//Approach 2
		swapApproach2();
//Approach 3		
		swapApproach3();
//Approach 4
		swapApproach4();
	}

	// Approach 1 using addition and subtraction operations
	static void swapApproach1() {
		int a = 10;
		int b = 20;
		System.out.println("before swapping " + a + "," + b);
		a = a + b;// 10+20=30
		b = a - b;// 30-20=10;
		a = a - b;// 30-10=20;
		System.out.println("Using addition and subtraction operations " + a + "," + b);
	}

	// Approach 2 created a method assigning a third variable ;
	static void swapApproach2() {
		int a = 10;
		int b = 20;
		int t = a;
		a = b;
		b = t;
		System.out.println("Using the Third Variable " + a + "," + b);
	}

	// Approach 3 Using multiplication and divide operation without using third
	// variable
	// here a & b values should not be Zero

	static void swapApproach3() {
		int a = 10;
		int b = 20;
		a = a * b;// 10*20=200
		b = a / b;// 200/20=10;
		a = a / b;// 200/10=20;
		System.out.println("multiplication and divide operation " + a + "," + b);
	}

	// Approach 4 Using the bitwise XOR (^)operator
	static void swapApproach4() {
		int a = 10;
		int b = 20;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Using the Bitwise Operator " + a + "," + b);
	}
}
