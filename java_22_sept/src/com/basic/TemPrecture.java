package com.basic;
//Temperature of a city in Fahrenheit degrees is input through 
//the keyboard. Write a program to convert this temperature 
//into Centigrade degrees.
public class TemPrecture {
public static void main(String[] args) {
	float fahrenheit,centigrade;
	
	fahrenheit=44;
	centigrade=((fahrenheit-32)*5)/9;
	System.out.println("temprature in centigrade is:"+centigrade);
	
	
}
}
