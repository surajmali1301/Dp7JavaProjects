package com.LoopLogicalPrograms;

import java.util.*;

public class KrishnamurthyNumber {

	static int krishna(int num) {
		int sum = 0;
		int rem = 0;
		while (num != 0) {
			rem = num % 10;
			int fact = 1;

			for (int i = 1; i <= rem; i++) {
				fact *= i;
			}
			sum += fact;
			num /= 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int original = num;

		if (krishna(num) == original) {
			System.out.println(num + " krishnamurthy number");
		} else {
			System.out.println(num + " not krishnamurthy number");

		}

	}

}
