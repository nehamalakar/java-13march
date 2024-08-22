package com.basic;
//loop-Write a program to enter the numbers till the user wants and 
//at the end it should display the count of positive, negative and 
//zeros entered.
//input n>0  positive number
// input n<0 negative number
// input n=0 neither positive nor negative
public class LoopposNeg {
public static void main(String[] args) {
	int n=-123;
	if (n>0) {
		System.out.println("positive number");
	}else if(n<0) {
		System.out.println("negative number");
	}else {
		System.out.println("niether positive nor negative number");
	}
}
}
