package com.oops;
//Assign and print the roll number, phone number and address of two students 
//having names "Sam" and "John" respectively by creating two objects of the class 'Student'.
class student{
	String name,address;
	int roll_no;
	long phone_no;
	
	
}
public class CreateClass {
public static void main(String[] args) {
	student sam=new student();
	sam.name="sam";
	sam.roll_no=2;
	sam.phone_no=8562458910l;
	sam.address="surat";
	
	student john=new student();
	john.name="john";
	john.roll_no=3;
	john.phone_no=9510925720l;
	john.address="Mumbai";
	
	
	System.out.println(sam.roll_no+" "+sam.phone_no+" "+sam.address);
	System.out.println(john.roll_no+" "+john.phone_no+" "+john.address);
	
	
}
}
