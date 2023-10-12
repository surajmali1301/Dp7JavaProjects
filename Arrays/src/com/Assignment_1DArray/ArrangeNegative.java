package com.Assignment_1DArray;

public class ArrangeNegative {

	static void arrange(int arr[]) {

		int n = arr.length;
		int i = -1;

		for (int j = 0; j < n; j++) {
			if (arr[j] < 0) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { -12, 5, -7, 24, -15, 8, 9, -2 };

		arrange(arr);
		
		 for (int num : arr) {
	            System.out.print(num + " ");
	        }
	}
}
