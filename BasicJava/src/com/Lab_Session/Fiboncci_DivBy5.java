package com.Lab_Session;

public class Fiboncci_DivBy5 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int num3;

		int count = 11;

		for (int i = 2; i <= count; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;

			if (num3 % 5 != 0) {

				System.out.print(num3 + " ");
			}
		}

	}
}
