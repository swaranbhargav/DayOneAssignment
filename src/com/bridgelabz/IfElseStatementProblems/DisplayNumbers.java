package com.bridgelabz.IfElseStatementProblems;

import java.util.Scanner;

public class DisplayNumbers {
	public static void main(String[] args) {
		 Scanner input  = new Scanner(System.in);
	        System.out.print("Enter a single digit number: ");
	        int digit = input.nextInt();
	        
	        if (digit == 1) {
	            System.out.println("One");
	        } else if (digit == 10) {
	            System.out.println("Ten");
	        } else if (digit == 100) {
	            System.out.println("Hundred");
	        } else if (digit == 1000) {
	            System.out.println("Thousand");
	        }
	}
}
