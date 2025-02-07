package com.io.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
//writing Data into text file
	public static void main(String[] args) throws IOException {
		// This class will create a new Text file with the name Test123.txt file and
		// there will be the below data

		FileWriter fWriter = new FileWriter("C:\\Users\\91774\\Documents\\Test123.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
		bufferedWriter.write("Hii");
		bufferedWriter.write(" Good Morning");
		bufferedWriter.write(" Every One");
		bufferedWriter.write(" Nice to meet you all");
		bufferedWriter.write(" Have a good day ");
		bufferedWriter.write(" Thanku");
		System.out.println("Finished !!");
		bufferedWriter.close();
	}
}
