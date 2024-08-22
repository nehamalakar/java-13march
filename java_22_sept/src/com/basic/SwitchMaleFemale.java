package com.basic;
//Write a program to read gender(M/F) and print the corresponding gender using a switch statement
public class SwitchMaleFemale {
public static void main(String[] args) {
	int gender='F';
	switch (gender) {
	case 'M':
	case 'm':
		System.out.println("Male");
		break;
	case 'F':
	case 'f':
		System.out.println("Female");
	default:
		break;
	}
}
}
