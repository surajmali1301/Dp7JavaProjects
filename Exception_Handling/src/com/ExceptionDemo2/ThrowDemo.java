package com.ExceptionDemo2;

import java.util.*;

public class ThrowDemo {

	static Scanner sc = new Scanner(System.in);

	static void enterDetails() {
		System.out.println("Enter the name: ");

		String name = sc.next();

		System.out.println("Enter the marks: ");

		int marks = sc.nextInt();

		if (marks < 0) {
			throw new ArithmeticException("Marks should be greater than 0");
		} else {
			if (marks >= 40) {
				System.out.println(name + " has cleared exam");
			} else {
				System.out.println(name + " has failed");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		enterDetails();

	}

}
