package com.Assignment_1DArray;

public class SwapArray {

	public static void swap(int[] arr) {
	

		for (int i = 0; i < arr.length - 1; i ++) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 9, 0 };

		swap(arr);

	}

}
