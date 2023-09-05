package com.Lab_Session;

public class FindMinimum_Number {

	public static void main(String[] args) {


		int num = 456798;
		int lowest = 9;
		while (num>0) {
			int rem1 = num % 10;
			if (lowest>rem1) {
				lowest=rem1;

			}
			num /= 10;

		}
		System.out.println(lowest);

	}

}
