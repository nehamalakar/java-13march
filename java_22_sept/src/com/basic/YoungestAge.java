package com.basic;
//condition---If the ages of Ram, Shyam and Ajay are input through the 
//keyboard, write a program to determine the youngest of the 
//three. 
public class YoungestAge {
public static void main(String[] args) {

	int ram=52,shyam=50,ajay=42;

	if(ram>shyam)
	{
		if(ram>ajay)
			System.out.println("ram Youngest age");
		else 
			System.out.println("ajay youngest age");
		}
		else {
			if(shyam>ajay)
				System.out.println("shyam Youngest age");
			else 
				System.out.println("ajay youngest age");
		}
	}
		
		}
	


