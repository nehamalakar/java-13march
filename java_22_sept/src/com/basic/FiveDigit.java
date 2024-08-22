package com.basic;
//If a five-digit number is input through the keyboard, write a 
//program to calculate the sum of its digits.
public class FiveDigit {
public static void main(String[] args) {
	int number,digit,sum;
	int no=45683;
	int rem1,rem2,rem3,rem4,rem5;
	rem1=no%10;//3
	no=no/10;//4568
	System.out.println("rem1:"+rem1);
	
	rem2=no%10; //8
	no=no/10; //456
	System.out.println("rem2:"+rem2);
	
	rem3=no%10;//6
	no=no/10; //45
	System.out.println("rem3:"+rem3);
	
	rem4=no%10; //5
	no=no/10;//4
	System.out.println("rem4:"+rem4);
	
	rem5=no%10;//4
	no=no/10;//
	System.out.println("rem5:"+rem5);
	
	int Sum;
	sum=rem1+rem2+rem3+rem4+rem5;
	System.out.println("sum of 5 digit:"+sum);
			
	 
}
}
