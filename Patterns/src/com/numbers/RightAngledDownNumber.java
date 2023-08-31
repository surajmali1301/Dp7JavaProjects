package com.numbers;

public class RightAngledDownNumber {

	public static void main(String[] args) {

		for (char i = 5; i >= 1; i--) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}

	}
}
