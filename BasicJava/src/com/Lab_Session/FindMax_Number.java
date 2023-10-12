package com.Lab_Session;

public class FindMax_Number {

	public static void main(String[] args) {

		int num = 123756;
		int greatest = 0;
		while (num>0) {
			int rem = num % 10;
			if (rem > greatest) {
				greatest=rem;

			}
			num /= 10;

		}
		System.out.println("greatest no: "+greatest);

	}

}
