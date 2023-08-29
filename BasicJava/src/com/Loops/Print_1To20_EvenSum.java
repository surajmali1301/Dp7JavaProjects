package com.Loops;

public class Print_1To20_EvenSum {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of Even Numbers:" + sum);

	}

}
