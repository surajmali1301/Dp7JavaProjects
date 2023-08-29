package com.LoopAssignment;

import java.util.Scanner;

public class PrintEvenFrom_121To229_UsinDoWhile {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num = ip.nextInt();
		do {
			System.out.println(num);
			num += 2;
		} while (num <= 229);

	}

}
