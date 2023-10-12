package com.LabSession2D_Array;

import java.util.*;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of row: ");
		int row = sc.nextInt();
		System.out.print("Enter no. of column: ");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter Values: ");
				arr[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
