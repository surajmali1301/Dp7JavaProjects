package com.LabSession2D_Array;

public class MaxNumber {

	static void max(int a[][]) {

		int max = a[0][0];
		for (int[] row : a) {
			for (int value : row) {
				if (value > max) { 
					max = value;
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };

		max(arr);
	}

}
