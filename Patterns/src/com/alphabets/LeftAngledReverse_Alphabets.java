package com.alphabets;

public class LeftAngledReverse_Alphabets {

	public static void main(String[] args) {

		for (char i = 'E'; i >= 'A'; i--) {
//			System.out.print(i+" ");
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
