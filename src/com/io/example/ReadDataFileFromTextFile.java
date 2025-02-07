package com.io.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFileFromTextFile {

	// Reading data from the Text file
	public static void main(String[] args) throws IOException {
//Approach 1 Using FileReader BufferReader
		FileReader fReader = new FileReader("C:\\Users\\91774\\Documents\\Test123.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		String str;
		while ((str = bReader.readLine()) != null) {
			System.out.println(str);
		}
		bReader.close();

		// Approach 2 Using forLoop & File
		File file = new File("C:\\Users\\91774\\Documents\\Test123.txt");
		Scanner scanner = new Scanner(file);
		// loop statement
		/*
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
	*/	
		// Approach 3 Using Scanner & File
		scanner.useDelimiter("\\Z");
		System.out.println(scanner.next());
	}
}
