package com.basic;
//Write a program using conditional operators to determine 
//whether a year entered through the keyboard is a leap year or 
//not
public class LeapYearorNot {
public static void main(String[] args) {
	int year=2019;
	
	if(year%4==0) {
		System.out.println(year+ "is a leap year");
	}else {
		System.out.println(year+"is a not leap year ");
	}
}
}
