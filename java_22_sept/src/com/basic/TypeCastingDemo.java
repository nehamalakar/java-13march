package com.basic;

public class TypeCastingDemo {

public static void main(String[] args) {
	int i1=12547;
	long l1=i1;
	System.out.println("implicit conversion is:"+l1);
	
    int i2=(int)l1;
    		System.out.println("explicit conversion is:"+i2);
    
    int i3=256;
    byte b1=(byte)i3;   //-128 to 127
    System.out.println("byte value is:"+b1);
    
    char ch='A';
    int i4= ch;
    System.out.println("implicit conversion is:"+i4);
    
    float f1=26.23f;
    double d1=f1;
    System.out.println("implicit conversion is:"+f1);
    
    double d2=9.78d;
    int i5 =(int)d2;
    System.out.println("explicit conversion is:"+d2);
    
    
    		
    
    
    
}

}



