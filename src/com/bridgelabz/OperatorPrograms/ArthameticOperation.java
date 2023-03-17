package com.bridgelabz.OperatorPrograms;

public class ArthameticOperation {
	
		public static void main(String[] args) {
		        int a = 1;
		        int b = 2;
		        int c = 5;	        
		        int maximumValue =Math.max(a + b * c, Math.max(c + a / b, Math.max(a % b + c, a * b + c)));
		        int minimumValue = Math.min(a + b * c, Math.min(c + a / b, Math.min(a % b + c, a * b + c)));
		        System.out.println("The maximum result is: " + maximumValue);
		        System.out.println("The minimum result is: " + minimumValue);

		

	}


}
