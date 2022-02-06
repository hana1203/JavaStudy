package com.hana.projectoop;
import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter file1= new FileWriter("data.txt");
		file1.write("hello ");
		file1.write("java");
		
		FileWriter file2 = new FileWriter("data2.txt");
		file2.write("Hello ");
		file2.write("Java2");
		file2.close();
		
		file1.write("!!!");
		file1.close();
		
	}

}
