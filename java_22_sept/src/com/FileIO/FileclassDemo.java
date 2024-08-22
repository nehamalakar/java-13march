package com.FileIO;

import java.awt.DisplayMode;
import java.io.File;
import java.io.IOException;
class FDemo{
	File file;
	public FDemo() throws IOException {
		 file=new File("file3.txt");
		file.createNewFile() ;
		System.out.println("this is FDemo");
		display();
		
	}
	public void display() {
		System.out.println("file is or not:"+file.isFile());
		System.out.println("is directory or not:"+file.isDirectory());
		System.out.println("can read or not:"+file.canRead());
		System.out.println("can excute or not:"+file.canExecute());
		System.out.println("can write or not:"+file.canWrite());
		System.out.println("file name:"+file.getName());
		System.out.println("file path:"+file.getPath());
		System.out.println("absolute path:"+file.getAbsolutePath());
	}
	
}
public class FileclassDemo {
public static void main(String[] args) throws IOException {
	new FDemo();
	
}
}
