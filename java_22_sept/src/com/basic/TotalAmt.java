package com.basic;

public class TotalAmt {
public static void main(String[] args) {
	int amt=856, total,t100,t50,t20,t10,t5,t2,t1;
	System.out.println("input the amount:"+amt);
	
	t100=amt/100;   //8
	System.out.println("number of notes of 100:"+t100);
	
	amt =amt%100; //56    
	t50=amt/50;//1
	System.out.println("number of notes  of 50:"+t50);
	
	amt= amt%50;//6
	t20=amt/20;//0
	System.out.println("number of notes of 20:"+t20);
	
	amt=amt%20;//5
	t10=amt/10;
	System.out.println("number of notes is 10:"+t10);
	amt=amt%10;
	t5=amt/5;
	System.out.println("number of notes is 5 :"+t5);
	
	amt=amt%5;
	t2=amt/2;
	System.out.println("number of notes is 2:"+t2);
	
	amt=amt%2;
	t1=amt/1;
	System.out.println("number of notes is 1:"+t1);
			
	
	

	
}
}
