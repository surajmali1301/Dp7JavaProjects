package com.LoopAssignment;

import java.util.Scanner;

public class CheckNoIsKrishnamurthiOrNot {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num = ip.nextInt();

		int temp = num;
		int rem = 0;
		int value = 0;
		int mul = 1;
		while (num != 0) {
			rem = num % 10;

			for (int i = 1; i <= rem; i++) {
				mul *= i;//Get extracted Number Factorial
			}

			value += mul;//Making Addition Of Factorials
			num /= 10;
		}

		if (temp == value) {
			System.out.println(temp + " is Krishnamurthi Number.");
		} else {
			System.out.println(temp + " is Not a Krishnamurthi Number.");
		}

	}

}
