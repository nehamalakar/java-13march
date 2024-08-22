package com.basic;



//The distance between two cities (in kilometer.) is input through the 
//keyboard. Write a program to convert and print this distance 
//in meters, feet, inches and centimeters.
public class TaskDemo {
public static void main(String[] args) {
	
	int km=10, meter,cm;
	float feet,inches;
	
	meter=km*1000;
	System.out.println("Distance in meters:"+meter);
 
	cm=km*100000;
	System.out.println("Distance in centimeters:"+cm);
	
	feet= km*3280.84f;
	System.out.println("Distance in feet:"+feet);
	
	inches= km*39370.08f;
	System.out.println("Distance in inches:"+inches);
 
 
 
 
 
}
}
