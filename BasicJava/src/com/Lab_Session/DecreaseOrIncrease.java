package com.Lab_Session;

import java.util.Scanner;

public class DecreaseOrIncrease {

	// To check if a number is increasing
	 static boolean inreasing(int num) {// 12345 || 1234789
		int rem1 = num % 10;
		num /= 10;

		while (num > 0) {
			int rem2 = num % 10;
			if (rem2 > rem1) {
				return false;
			}
			rem1 = rem2;
			num /= 10;
		}

		return true;
	}

	// To check if a number is decreasing
	 static boolean decresing(int num) {//98765 || 9876321
		int rem1 = num % 10;
		num /= 10;

		while (num > 0) {
			int rem2 = num % 10;
			if (rem2 < rem1) {
				return false;
			}
			rem1 = rem2;
			num /= 10;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (inreasing(num)) {
			System.out.println(num + " is an increasing number.");
		} else if (decresing(num)) {
			System.out.println(num + " is a decreasing number.");
		} else {
			System.out.println(num + " is a bouncy number.");
		}
		sc.close();
	}
}
