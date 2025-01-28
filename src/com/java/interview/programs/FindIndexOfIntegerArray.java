package com.java.interview.programs;

public class FindIndexOfIntegerArray {

	public static void main(String[] args) {

		int number[] = { 1, 2, 3, 5, 7, 10, 20, 11, 15 };
		int target = 11;
		int index = linerSearch(number, target);
		if (index == -1) {
			System.out.println("Index Not Found");
		} else {
			System.out.println("Index value " + index);
		}
	}

	public static int linerSearch(int number[], int target) {

		for (int i = 0; i < number.length; i++) {
			if (number[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
