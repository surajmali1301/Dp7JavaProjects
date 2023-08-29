package com.Lab_Session;

import java.util.*;

public class PrimeOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = sc.nextInt();

		boolean flag = false;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}

	}

}
