package com.basic;
//Write a java program to convert a given integer (in days) to years, months and days, assuming that all 
//months have 30 days and all years have 365 days.
//
public class DaysMonth {
public static void main(String[] args) {
	int years,days=2535,month,rem;
	
	years=(int)days/365;
	System.out.println("number of years:"+years);
	
	
	rem=days%365;
	System.out.println("number of remdays:"+rem);
	
	month=345/30;
	System.out.println("number of months:"+month);
	
	days=((days%365))%30;
	
	System.out.println("number of days:"+days);
	
}
}
