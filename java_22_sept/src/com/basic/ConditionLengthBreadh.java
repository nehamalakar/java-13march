package com.basic;
//condition---Given the length and breadth of a rectangle, write a program to 
//find whether the area of the rectangle is greater than its 
//perimeter. For example, the area of the rectangle with length = 5 
//and breadth = 4 is greater than its perimeter.
public class ConditionLengthBreadh {
public static void main(String[] args) {
	int length=5,breadth=4,area,perimeter;
	 area=length*breadth;
	 System.out.println("area of rectangle is:"+(length*breadth));
	 
	 perimeter=2*(length+breadth);
	 System.out.println("perimeter of rectangle is:"+(perimeter));
	 
	 if(area>perimeter) {
		 System.out.println(area +" rectangle is greater than perimeter");
		 
	 }else {
		System.out.println(perimeter +" rectangle is greater than area");
	}
	
	
}
}
