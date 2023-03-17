package com.bridgelabz.ArrayHandlingProblems;

public class DuplicateElementsOfArray {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 20, 50, 60, 50};
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	               System.out.println(arr[j]);
	            }
			}       
		}
	}

}
