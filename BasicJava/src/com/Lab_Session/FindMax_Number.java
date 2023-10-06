package com.Lab_Session;

public class FindMax_Number {

	public static void main(String[] args) {

		int num = 123756;
		int greatest = 0;
		while (num>0) {
			int rem1 = num % 10;
			if (rem1 > greatest) {
				greatest=rem1;

			}
			num /= 10;

		}
		System.out.println("greatest no: "+greatest);

	}

}
