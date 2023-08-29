package com.LoopAssignment;

import java.util.Scanner;

public class PrintOdd_521To229_UsingWhile {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = ip.nextInt();
		while (num >= 229) {
			System.out.println(num);
			num -= 2;

		}

	}

}
