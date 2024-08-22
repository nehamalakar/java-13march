package com.basic;

import java.awt.Event;

//2.Condition-Any integer is input through the keyboard. Write a program to 
//find out whether it is an odd number or even number
//odd number =1,3,5,7,9,11,13
// even number= 2,4,6,8,10,12
public class OddEven {
public static void main(String[] args) {
	int x=15;
	if(x%2==0) {
		System.out.println(x +" is even");
	}else {
		System.out.println(x +" is odd");
	}
}
}
