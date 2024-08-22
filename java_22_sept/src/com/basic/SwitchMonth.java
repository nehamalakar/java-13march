package com.basic;
//Write a program to Find the number of days in a month using a switch statement
//
public class SwitchMonth {
public static void main(String[] args) {
	int days,month=2;
	switch (month) {
	case 2:
		days=28;
		System.out.println("number of days 28");
		break;
	case 1:
	case 3:
	case 5:	
	case 7:
	case 8:
	case 10:	
	case 12:
		System.out.println("number of days  31");
		break;
	case 4:
	case 6:
	case 9:
	case 11:

		System.out.println("number of days 30");
		break;
	
	
	default:
	break;
	
	}
	
	
}
}
