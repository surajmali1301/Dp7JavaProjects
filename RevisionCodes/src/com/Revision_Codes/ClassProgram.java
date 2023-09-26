/*generate your own function to satisfy the relationship between the inputs and outputs.
Your task is to create a function that, when fed the inputs below, produce the sample outputs shown.
Examples
832 ➞ 594
51 ➞ 36
7977 ➞ 180
1 ➞ 0
665 -> 99
149 -> 0*/
package com.Revision_Codes;

import java.util.*;

public class ClassProgram {

	// Function to reverse a number
	public static int reverseNumber(int num) {
		int rev1 = 0;
		while (num != 0) {// reversing number
			int rem = num % 10;
			rev1 = rev1 * 10 + rem;
			num /= 10;
		}
		return rev1;
	}

	public static void main(String[] args) {//1
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num2 = sc.nextInt();

		int rev = reverseNumber(num2);// giving reversed number
		int result = num2 - rev;// Subtracting reversed number from entered number

		if (result < 0) {
			System.out.println("Result is less than 0: 0");
		} else {
			System.out.println("Result: " + result);
		}

		sc.close();
	}
}
