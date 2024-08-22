package com.basic;
//2.Condition- If cost price and selling price of an item is input through the 
//keyboard, write a program to determine whether the seller has 
//made profit or incurred loss. Also determine how much profit 
//he made or loss he incurred. 
public class ConditionDemoProfitloss {
public static void main(String[] args) {
	int cp=100,sp=120;
	int profit=sp-cp;

	System.out.println("profit is:"+(sp-cp));
	
	if (profit>0) {
		System.out.println("seller made a profit of:"+profit);
	}else {
		if (profit<0) {
			System.out.println("seller made a loss:"+profit);
		}else {
			System.out.println("seller made a profit");
		}
	}
}
}
