package com.basic;
//Write a program to Check whether a character is a vowel or consonant using switch statement

public class SwitchVovelcon {
public static void main(String[] args) {
	int ch='a';
	
	
	switch (ch) {
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	case 'a':
	case 'e':
	case 'i':
	case 'u':
		System.out.println("vowel");
	
		break;

	default:
		System.out.println( "consonant");
		break;
	}
}

	
	
}	

