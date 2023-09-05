
package com.Lab_Session;

public class PrimeOrNot2 {

	// Function to check if a number is prime or not
	 static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i< num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		long number = 78654329;
		System.out.println("Prime numbers from the digits in " + number + ":");

		while (number > 0) {
			int digit = (int) (number % 10);//type casting and getting remainder
			if (isPrime(digit)) {
				System.out.print(digit + " ");
			}
			number /= 10;
		}
	}
}
