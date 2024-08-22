package com.basic;
//In a town, the percentage of men is 52. The percentage of 
//total literacy is 48. If total percentage of literate men is 35 of 
//the total population, write a program to find the total number 
//of illiterate men and women if the population of the town is 
//80,000.
public class PopulationPercentage {
public static void main(String[] args) {
	int pop=80000;
	int popmen=(52*pop)/100;
	int popwoman=pop-popmen;
	int popliteracy=(48*pop)/100;
	int litmen=(35*popmen)/100;
	int litwoman=popliteracy-litmen;
	int illtmen=popmen-litmen;
	int illwoman=popwoman-litwoman;
	
	System.out.println("Total population:"+pop);
	System.out.println("total men:"+popmen);
	System.out.println("total womans:"+popwoman);
	System.out.println("total literacy:"+popliteracy);
	System.out.println("total literacy men:"+litmen);
	System.out.println("total literacy woman:"+litwoman);
	System.out.println("total illeterate men:"+litmen);
	System.out.println("totalilleteratewoman:"+litwoman);
			
			
			
			
			
			
			
			
			
			
			
			
}
}
