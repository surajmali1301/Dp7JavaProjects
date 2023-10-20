package com.Assignment_1DArray;

public class ArrangeEvenBefore {

	static void arrange(int arr[]) {

		int n = arr.length;
		int index = -1;

		for (int j = 0; j < n; j++) {
			if (arr[j] %2== 0) {
				index++;
				int temp = arr[index];//stores even number
				arr[index] = arr[j];//stores even number at left/first
				arr[j] = temp;
//				System.out.println(arr[index]);
			}
		}
	
	}

	public static void main(String[] args) {
		int[] arr = { 12, 5, 7, 24, 15, 8, 9, 2 };

		arrange(arr);
		
		 for (int num : arr) {
	            System.out.print(num + " ");
	        }
	}

}
