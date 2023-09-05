package com.Lab_Session;

import java.util.Scanner;

public class DecreaseOrIncrease {

	// To check if a number is increasing
	public static boolean isAscending(int num) {
		int lastDigit = num % 10;
		num /= 10;

		while (num > 0) {
			int currentDigit = num % 10;
			if (currentDigit >= lastDigit) {
				return false;
			}
			lastDigit = currentDigit;
			num /= 10;
		}

		return true;
	}

	// To check if a number is decreasing
	public static boolean isDecending(int num) {
		int lastDigit = num % 10;
		num /= 10;

		while (num > 0) {
			int currentDigit = num % 10;
			if (currentDigit <= lastDigit) {
				return false;
			}
			lastDigit = currentDigit;
			num /= 10;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (isAscending(num)) {
			System.out.println(num + " is an increasing number.");
		} else if (isDecending(num)) {
			System.out.println(num + " is a decreasing number.");
		} else {
			System.out.println(num + " is a bouncy number.");
		}
		sc.close();
	}
}
