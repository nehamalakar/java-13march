package com.basic;
// Write a java programe to read an amount (integer value)and break the amount in to the smallest possible
//number of bank notes.
public class bankAccount {
public static void main(String[] args) {
	int amt=375, total,t100,t50,t20,t10,t5,t2,t1;
	System.out.println("input the amount:"+amt);
	
	t100=amt/100;   //3
	System.out.println("number of notes of100:"+t100);
	
	amt=amt%100;   //75
	t50=amt/50;
	System.out.println("number of notes of 50:"+t50);
	
	amt=amt%50;     //25
	t20=amt/20;
	System.out.println("number of notes of 20:"+t20);
	
	amt=amt%20;
	t10=amt/10;
	System.out.println("number of notes of 10:"+t10);
	
	amt=amt%10;
	t5=amt/5;
	System.out.println("number of notes of 10:"+t5);
	
	amt=amt%5;
	t2=amt/2;
	System.out.println("number of notes of 5:"+t2);
	
	
	
	
	
	
	
}
}
