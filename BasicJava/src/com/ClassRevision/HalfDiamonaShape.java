package com.ClassRevision;

public class HalfDiamonaShape {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {// 5 iterations

			for (int s = 5; s <= (5 - i); s++) {
				System.out.print("");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * O/p:- * * * * * * * * * * * * * * *
		 * 
		 */
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= (i-5); j++) {
				System.out.print("");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
