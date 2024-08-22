package com.basic;
//Write a program to find the greatest of the three numbers 
//entered through the keyboard using conditional operators.
public class GreatestNumber {
public static void main(String[] args) {
	int a=25,b=30,c=45;
	if(a>b && a>c) {
		System.out.println(" A is greatest number");
	}else if(b>a && b>c){
		System.out.println("b is greatest number");
		
	}else {
		System.out.println("c is greatest number");
	}
}
}
