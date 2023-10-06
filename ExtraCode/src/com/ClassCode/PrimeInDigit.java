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
		long num = sc.nextLong();
		System.out.println("Prime numbers from the digits in " + num + ":");

		while (num > 0) {
			int digit = (int) (num % 10);// type casting and getting remainder
			if (isPrime(digit)) {
				System.out.print(digit + " ");
			}
			num /= 10;
		}

	}

}
