package com.FileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class ByteStreamDemo {
public static void main(String[] args) throws Exception {
	
	FileOutputStream fos=new FileOutputStream("file1.txt",true);
	String msg="\nthis is tops technologies...surat";
	byte[]b=msg.getBytes();
	fos.write(b);
	fos.flush();
	fos.close();
	
	System.out.println("data writen is successfully");
	
	FileInputStream fis=new FileInputStream("file1.txt");
	int x;
	while((x=fis.read())!=-1) {
	System.out.print((char)x);
	
	}
      fis.close();

}
}