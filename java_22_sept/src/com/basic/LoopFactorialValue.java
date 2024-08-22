package com.basic;
//loop- Write a program to find the factorial value of any number 
//entered through the keyboard.
// factorial =5    5*4*3*2*1
public class LoopFactorialValue {
public static void main(String[] args) {
	int i=1,num=5,fact=1;
	for(i=1;i<=5;i++) {
		fact=fact*i;
		
	}
	System.out.printf("factorial of %d=%d",num,fact);
}
}
