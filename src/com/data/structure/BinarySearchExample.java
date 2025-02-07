package com.data.structure;

public class BinarySearchExample {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 35, 7, 8, 9, 10 };
		int target = 9;
		int index = binarySearch(arr, target);
		if (index == -1) {
			System.out.println("Index Not Found");
		} else {
			System.out.println("Index value " + index);
		}
		
	}

	static int binarySearch(int arr[], int target) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;

		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
