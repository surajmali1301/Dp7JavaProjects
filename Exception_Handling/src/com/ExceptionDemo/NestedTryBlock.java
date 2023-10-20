package com.ExceptionDemo;

import java.util.*;

public class NestedTryBlock {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[3];

		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the numbers: ");
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < arr.length; i++) {
				try {
					System.out.println("----------");
					System.out.println("Ans: " + (100 / arr[i]));
				} catch (ArithmeticException e) {
					System.out.println(e);
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

		finally {
			System.out.println("----------");
			sc.close();
			System.out.println("Scanner closed");
		}
	}

}
