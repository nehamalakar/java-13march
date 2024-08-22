package com.basic;

public class FirstDemo {
public static void main(String[] args) {
	int i1=254879856;
	long l1=58456784552l;
	byte b1=127;
	boolean bb=true;//1bit
	char ch='B';
	float f1=46.285f;
	double d1=25.2356;
	
	System.out.println("integer value is:"+i1);
	System.out.println("long value is:"+l1);
	System.out.println("byte value is:"+b1);
	System.out.println("boolean value is:"+bb);
	System.out.println("char value is:"+ch);
	System.out.println("float value is:"+f1);
	System.out.println("double value is:"+d1);
	
	System.out.println("size if ineger value is:"+Integer.BYTES+" bytes");
	System.out.println("size of long value is:"+Long.BYTES+" bytes");
	System.out.println("size of char value is:"+Character.BYTES+" bytes");
	System.out.println("size of float value is:"+Float.BYTES+" bytes");
	
	
}
}
