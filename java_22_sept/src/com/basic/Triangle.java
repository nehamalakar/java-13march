package com.basic;
//condition---Write a program to check whether a triangle is valid or not, 
//when the three angles of the triangle are entered through the 
//keyboard. A triangle is valid if the sum of all the three angles 
//is equal to 180 degrees.
public class Triangle {
public static void main(String[] args) {
 int angle1=60,angle2=40,angle3=80;
 if((angle1+angle2+angle3)==180)
	 System.out.println("the triangle is valid");
 else {
	System.out.println("the triangle is invalid");
}
	}

	
}


