package com.Revision_Codes;

public class DiamonaShape_Pyramid {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {//5 iterations
			for (int j = 1; j<= (5 - i); j++) {//to print space
				/*               5 - 1=4 spaces(1)
				 * 				 5 - 2=3   	   (3)
				 *  			 5 - 3=2       (5)
				 *  			 5 - 4=1	   (7)*/
				System.out.print("s");
			}

			for (int j = 1; j<=i ; j++) {// to print star(2)(4)(6)(8)
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("s");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}


	}
}
