package com.basic;
//2-Condition Any year is input through the keyboard. Write a program to 
//determine whether the year is a leap year or not. 
//(Hint: Use the % (modulus) operator)


public class LeapYear {
public static void main(String[] args) {
	int year=2024;
	
	if(year%4==0) {
		System.out.println(year+" is a leap year");
	}else {
		System.out.println(year+" is a not a leap year");
	}
	
		
}
}
