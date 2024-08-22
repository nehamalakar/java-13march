package com.FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharcterStreamDemo {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("file2.txt");
	String msg="today it is cloudy";
	fw.write(msg);
	fw.flush();
	fw.close();
	System.out.println("data writen is succesfully");
	
	FileReader fr=new FileReader("file2.txt");
	int x;
	while((x=fr.read())!=-1) {
		System.out.println((char)x);
	}
	fr.close();
}
}
