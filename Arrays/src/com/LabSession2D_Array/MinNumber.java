package com.LabSession2D_Array;

public class MinNumber {
	static void min(int a[][]) {

		int min = a[0][0];
		for (int[] row : a) {
			for (int value : row) {
				if (value < min) { 
					min = value;
				}
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };

		min(arr);
	}

}
