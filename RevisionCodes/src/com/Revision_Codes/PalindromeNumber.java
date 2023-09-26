package com.Revision_Codes;

import java.util.*;

public class PalindromeNumber {

	static int reverse(int n) {
		int rev = 0;
		while (n > 0) {//loop ends n>0--->0>0
			rev = rev * 10 + n % 10;
		//  rev =  0 * 10 + 121 % 10;-->1
		//  rev =  1 * 10 + 12 % 10;--->2
	   //   rev = 121 * 10 + 1  % 10;-->1
			n/=10;//123--->12
				// 12 --->1
			   //  1  --->0
		}

		return rev;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();


		if (n == (reverse(n))) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}
}
