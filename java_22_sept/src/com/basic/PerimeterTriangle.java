package com.basic;

import java.awt.geom.Area;
import java.util.Scanner;

//Write a program to print the area and perimeter of a triangle 
//having sides of 3, 4 and 5 units by creating a class named 'Triangle' 
//with a function to print the area and perimeter.



	

public class PerimeterTriangle {
public static void main(String[] args) {
	int a=3,b=4,c=5;
	double perimeter,s,area;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("\n enter the 3 sides of triangle");
	double side1=sc.nextDouble();
	double side2=sc.nextDouble();
	double side3=sc.nextDouble();
	
	perimeter=side1+side2+side3;
	s=perimeter/2;
	area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	
	System.out.format("\n the perimeter of triangle=%.2f\n",perimeter);
	System.out.format("\n the area of triangle=%.2f\n",area);
	}
	

}
