package com.bridgelabz.ArrayHandlingProblems;

public class SmallestElementoOfArray {
	public static void main(String[] args) {
		
        int[] arr = {10, 20, 30, 40, 50};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + min);
    }

}
