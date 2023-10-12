package com.Assignment_1DArray;

public class CalculateAverage {// Without Minimum and Maximum

	static void average(int arr[]) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int num : arr) {
			if (num < min) {
				min = num;// swap
			}
			if (num > max) {
				max = num;// swap
			}
			sum += num;
		}

		double average = (sum - min - max) / (arr.length - 2.0);
		System.out.println("Average excluding min and max: " + average);
	}

	public static void main(String[] args) {
		int[] arr = { 12, 5, 7, 24, 15 };

		average(arr);
	}
}
