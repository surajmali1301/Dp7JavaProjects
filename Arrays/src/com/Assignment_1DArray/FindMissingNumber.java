package com.Assignment_1DArray;

public class FindMissingNumber {

	static void find(int arr[]) {
		
		int n = arr.length + 1;//1 for missing character
		int sum = n * (n + 1) / 2;
		System.out.println(sum);//sum of array
		
		for (int num : arr) {
			sum -= num;//28-23=5
		}
		
		System.out.println("Missing number is: " + sum);
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7 };
		
		find(arr);
	}
}












//		int sum2=0;
//		for (int i = 0; i < arr.length; i++) {
//			sum2+=arr[i];
//		}