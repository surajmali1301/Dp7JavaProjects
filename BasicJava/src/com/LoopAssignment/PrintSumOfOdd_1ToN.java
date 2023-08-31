package com.LoopAssignment;

import java.util.Scanner;

public class PrintSumOfOdd_1ToN {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num = ip.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				sum += i;// 1 to 10 odds sum---->1 3 5 7 9 = 25
				// 1. sum = sum + i; 0=0+1;
				// 2. sum = 1 + 3;-->4
				// 3. sum = 4 + 5;-->9
				// 4. sum = 9 +7;-->16
				// 5. sum = 16+9;----->(25)
			}
		}
		System.out.println("Sum Of Odd From 1 To N:" + sum);

	}

}
