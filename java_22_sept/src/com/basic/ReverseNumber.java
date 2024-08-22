package com.basic;
//condition---A five-digit number is entered through the keyboard. Write a 
//program to obtain the reversed number and to determine 
//whether the original and reversed numbers are equal or not.
// input number=12345     reverse number=54321
public class ReverseNumber {
public static void main(String[] args) {
	int number=98765,rev=0;
	
	System.out.println("98765");
	while(number!=0)
	{
		int rem=number%10;
		rev=rev*10+rem;
		number=number/10;
		
	}
		
	System.out.println("the reverse of the given number is:"+rev);
}
}
