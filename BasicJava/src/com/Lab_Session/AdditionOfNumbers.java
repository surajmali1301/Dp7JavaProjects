package com.Lab_Session;

import java.util.*;

public class AdditionOfNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		int sum = 0;

		while (true) {

			int num1 = sc.nextInt();

			sum = sum+num1;
			if (num1 == 0)
				break;

		}
		System.out.println(sum);

	System.exit(0);
	}

}
