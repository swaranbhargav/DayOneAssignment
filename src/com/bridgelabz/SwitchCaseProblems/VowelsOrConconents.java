package com.bridgelabz.SwitchCaseProblems;

import java.util.Scanner;

public class VowelsOrConconents {

	public static void main(String[] args) {
		Scanner alphabit = new Scanner(System.in);
		System.out.println("Enter the value :");
		 char value = alphabit.next().charAt(0);

	    switch (value) {
	            case 'a':
	            	System.out.println("The value is a vowel.");
	            	break;
	            case 'e':
	            	System.out.println("The value is a vowel.");
	            	break;
	            case 'i':
	            	System.out.println("The value is a vowel.");
	            	break;
	            case 'o':
	            	System.out.println("The value is a vowel.");
	            	break;
	            case 'u':
	                System.out.println("The value is a vowel.");
	                break;
	        }


	}

}
