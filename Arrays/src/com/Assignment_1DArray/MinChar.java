package com.Assignment_1DArray;

public class MinChar {

	static void min(char arr[]) {
		char minChar = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < minChar) {
				minChar = arr[i];
			}
		}

		System.out.println("Min character is: " + minChar);
	}

	public static void main(String[] args) {
		char[] arr = { 'A', 'D', 'E', 'x', 'R', 'Z', 'p' };

		min(arr);
	}
}
