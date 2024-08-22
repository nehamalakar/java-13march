package com.basic;
//Write a program to read a weekday number and print weekday name using switch statement
public class SwitchWeekDay {
public static void main(String[] args) {
	int choice=3;
	switch (choice) {
	case 1:
		System.out.println("sunday");
		break;
	case 2:
		System.out.println("monday");
		break;
		
	case 3:
		System.out.println("tuesday");
		break;
		
	case 4:
		System.out.println("wednesday");
		break;
	case 5:
		System.out.println("thursday");
		break;
	case 6:
		System.out.println("friday");
		break;
	case 7:
		System.out.println("saturday");
		break;
	default:
		break;
	}
}
}
