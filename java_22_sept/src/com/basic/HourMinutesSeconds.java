package com.basic;
// write a java program to convert a given integer (in seconds)to hours,minutes and seconds.
//input seconds 25300
//expected output
public class HourMinutesSeconds {
public static void main(String[] args) {
	int hours,minuts,seconds,rem;
	int totalseconds=25300;
	hours=totalseconds/3600;
	System.out.println("total hrs: "+hours);
	
	rem=totalseconds%3600;//100
	minuts=rem/60;//
	System.out.println("total min is :"+minuts);
	
	rem=rem%60;//40
	System.out.println("total seconds is:"+rem);
	
	
	 
	
}
}
