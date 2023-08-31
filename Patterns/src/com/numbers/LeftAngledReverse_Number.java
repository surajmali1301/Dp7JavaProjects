package com.numbers;

public class LeftAngledReverse_Number {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
//			System.out.print(i+" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
