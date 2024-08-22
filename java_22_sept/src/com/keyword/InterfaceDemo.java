package com.keyword;

class result {
	String grade;
	public void setresult() {
		grade="A+";
	}
}
class Staff extends result implements Student{

	@Override
	public void show() {
		
		System.out.println("s no is: "+s_no);
		System.out.println("grade is:"+grade);
		System.out.println("i is: "+i);
	}
	
}
public class InterfaceDemo {
public static void main(String[] args) {
	Staff s1=new Staff();
	s1.setresult();
	s1.show();
	
}
}
