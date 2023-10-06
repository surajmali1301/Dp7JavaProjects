package com.LabSession_Array;

import java.util.*;

public class AverageRainFall {

	static void avg(int a[]) {

		int sum = 0;
		float avg = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			avg = sum / a.length;
		}
		System.out.println("Average of RainFall "+avg);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Values: ");
			arr[i] = sc.nextInt();
		}

		avg(arr);
	}

}
