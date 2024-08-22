package com.basic;

public class MinutsSecHRS {
	public static void main(String[] args) {
		
	
int hours,minutes,seconds,rem;
int totalseconds=85200;

hours=totalseconds/3600;
System.out.println("total hourse is:"+hours);

rem=totalseconds%3600;   //2400
minutes=rem/60;
System.out.println("total minutes is:"+minutes);

rem=rem%60;
System.out.println("total second is:"+rem);


}
}
