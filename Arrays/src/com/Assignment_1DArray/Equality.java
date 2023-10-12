package com.Assignment_1DArray;

public class Equality {

	static void equality(int arr1[], int arr2[]) {

		boolean isEqual = true;

		if (arr1.length != arr2.length) {
			isEqual = false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					isEqual = false;
					break;
				}
			}
		}

		if (isEqual) {//if true
			System.out.println("Both arrays are equal.");
		} else {
			System.out.println("Arrays are not equal.");
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 12, 22, 32, 42, 52, 62 };
		int[] arr2 = { 52, 22, 62, 12, 42, 22 };

		equality(arr1,arr2);
	}
}
