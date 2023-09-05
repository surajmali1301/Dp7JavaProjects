package com.Lab_Session;

import java.util.*;

public class ArmstrongNumber {

	static boolean armstrong(int num) {
		int temp = num;
		int temp1 = num;
		int count = 0;

		while (temp != 0)// condition
		{
			temp /= 10;
			count++; // it will count temp oprations until num completely get removed
		}

		int sum = 0;
		while (temp1 > 0) {

			int rem = temp1 % 10;
			int result = 1;
			for (int i = 1; i <= 1500; i++) {// when loop iterates 3 times
												// loop starts for again for next num
				result = result * rem;

			}
			sum = sum + result;// after for loop
			temp1 /= 10;

			System.out.println(sum);

		}
		return sum == num;
	}

	public static void main(String[] args) {

//		
		for (int num = 1; num <= 1500; num++)
			if (armstrong(num)) {
				System.out.println(num);
			}

	}

}
