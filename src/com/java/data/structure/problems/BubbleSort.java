package com.java.data.structure.problems;

public class BubbleSort {

	// reference from the apna college 
	public static void main(String[] args) {
		int arr[] = { 12, 34, 11, 1, 5, 7, 21 };
		bubbleSort(arr);
		sort(arr);
	}

	static void bubbleSort(int arr[]) {
		for (int turn = 0; turn < arr.length - 1; turn++) {
			for (int j = 0; j < arr.length - 1 - turn; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	static void sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

//Idea: if arr[i] > arr[i+1] swap them. To place the element in their respective position, we have to do the following operation N-1 times. 
//Time Complexity: O(N2)