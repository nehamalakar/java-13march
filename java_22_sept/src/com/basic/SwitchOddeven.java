package com.basic;
//Write a program to Check whether the number is even or odd using switch statement

public class SwitchOddeven {
public static void main(String[] args) {
	int num=75;
	switch (num%2) {
	case 1:
		System.out.println("this is odd number");
		break;
	
		
	default:
		System.out.println("this is even number");
		break;
	}
}
}
