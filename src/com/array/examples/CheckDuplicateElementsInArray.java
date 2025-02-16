package com.array.examples;

public class CheckDuplicateElementsInArray {

	public static void main(String[] args) {
		String arr[] = { "java", "C", "C++", "Python", "java" };
//Apporach 1
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Found Dupicate Elements : " + arr[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Dupicate Elements not found");
		}

	}
}
