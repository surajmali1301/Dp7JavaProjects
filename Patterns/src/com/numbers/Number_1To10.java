package com.numbers;

public class Number_1To10 {

	public static void main(String[] args) {
		int a=1;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j<= (4 - i); j++) {
				System.out.print(" ");
			}

			for (int j = 1; j<=i ; j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}

	}
}
