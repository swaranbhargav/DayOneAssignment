package com.bridgelabz.WhileLoopProblems;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	        System.out.print("Enter a positive integer n: ");
	        int number = input.nextInt();
	        
	        int sum = 0;
	        int i = 1;
	        while (i <= number) {
	            sum = sum + i;
	            i++;
	        }
	        
	        System.out.println("The sum of the first " + number + " natural numbers is " + sum);

	}


}
