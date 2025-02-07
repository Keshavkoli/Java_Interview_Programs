package com.data.structure;

public class LinearSearchExample {

	public static void main(String[] args) {

		int arr[] = { 20, 10, 30, 50, 40 };
		int target = 50;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("Elements found at " + i + " Position");
				flag = true;
				break;
			}

		}
		if (flag == false) {
			System.out.println("Element not Found");
		}

	}
}
