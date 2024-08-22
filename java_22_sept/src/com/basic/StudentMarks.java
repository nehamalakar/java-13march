package com.basic;
//If the marks obtained by a student in five different subjects 
//are input through the keyboard, find out the aggregate marks 
//and percentage marks obtained by the student. Assume that 
//the maximum marks that can be obtained by a student in each 
//subject is 100.

public class StudentMarks {
	public static void main(String[] args) {
		int s1=85, s2=65,s3=45,s4=75,s5=84;
		int em=s1+s2+s3+s4+s5;
		System.out.println("aggrigate marks is:"+em);
		
		float pr=em/5;
		System.out.println("percentage is:"+pr);
		
	}
}
