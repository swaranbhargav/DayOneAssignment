package com.bridgelabz.ForLoopProblems;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner numbers = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int number = numbers.nextInt();
        
        int sum = 0;
        int i;
        for (i=1; i<=sum ;i++) {
            sum = sum + i;
            
        }
        
        System.out.println("The sum of " + number + " numbers is " + sum);


	}


}
