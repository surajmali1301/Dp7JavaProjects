package com.ClassCode;

import java.util.Scanner;

public class ImeiNumeber {
	public static int countDigits(long number) {
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long number;
		do {
			System.out.print("Enter a 15-digit number: ");
			number = sc.nextLong();
		} while (countDigits(number) != 15);

		int sumOfDigits = 0;
		while (number != 0) {
			sumOfDigits += number % 10;
			number /= 10;
		}

		boolean isDivisibleBy10 = sumOfDigits % 10 == 0;

		System.out.println("Sum of Digits: " + sumOfDigits);
		System.out.println("Is Divisible by 10: " + isDivisibleBy10);
	}

}
