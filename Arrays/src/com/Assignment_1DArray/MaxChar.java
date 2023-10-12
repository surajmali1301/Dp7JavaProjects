package com.Assignment_1DArray;

public class MaxChar {

	static void max(char arr[]) {
		char maxChar = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxChar) {
				maxChar = arr[i];
			}
		}

		System.out.println("Max character is: " + maxChar);
	}

	public static void main(String[] args) {
		char[] arr = { 'A', 'D', 'E', 'x', 'R', 'Z', 'p' };

		max(arr);
	}
}
