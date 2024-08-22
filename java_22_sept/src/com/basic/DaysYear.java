package com.basic;
//write a java program to convert specified days into years,weeks and days.
// days=1329.
public class DaysYear {
public static void main(String[] args) {
	int days=1329,week,year ;
	int years=days/365;
	System.out.println("calculate the years:"+years);
	
	week=days%365/7;   //234
	System.out.println("calculate the weeks:"+week);
	
	
	
	days=days-((3*365)+(33*7));//calculate remaining days
	
	
	System.out.println("calculate the days:"+days);
	
	
}
}
