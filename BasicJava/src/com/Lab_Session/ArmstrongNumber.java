package com.Lab_Session;

import java.util.*;

public class ArmstrongNumber {

	static boolean armstrong(int num) {
		int original = num;
		int sum = 0;
		int count = 0;
		int temp=num;

		while (temp != 0) {
			temp /= 10;
			count++;
		}
		temp = num;
		while (temp != 0) {
			int rem = temp % 10;
			sum += Math.pow(rem, count);

			temp /= 10;
		}

		return sum==original;
	}

	public static void main(String[] args) {
		System.out.println("Armstrong between 1 to 1500: ");
//		
		for (int num = 1; num <= 1500; num++)
			if (armstrong(num)) {
				System.out.println(num + " ");
			}
	}

}
