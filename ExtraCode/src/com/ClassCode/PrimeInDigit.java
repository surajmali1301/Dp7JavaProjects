package com.ClassCode;

import java.util.*;

public class PrimeInDigit {

	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find");
		long number = sc.nextLong();
		System.out.println("Prime numbers from the digits in " + number + ":");

		while (number > 0) {
			int digit = (int) (number % 10);// type casting and getting remainder
			if (isPrime(digit)) {
				System.out.print(digit + " ");
			}
			number /= 10;
		}

	}

}
