package com.If_Else_Assignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter the Year:");
		int year = ip.nextInt();

		if ((year % 400 == 0) || (year % 100 == 0 && year % 4 == 0)) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}

	}

}
