package com.data.structure;

public class BinarySearchExample2 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10 };
		int target = 5;
		System.out.println("index value " + binarySearch(a, target));
	}

	static int binarySearch(int a[], int target) {

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == target) {
				return mid;
			} else if (a[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}
}
