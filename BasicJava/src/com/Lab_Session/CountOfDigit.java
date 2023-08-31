package com.Lab_Session;

public class CountOfDigit {

	static void count(int num, int digit) {
		int count = 0;
		int rem = 0;
		while (num != 0) {//
			rem = num % 10;// last
			if (rem == digit) {//digit=2;
				count++;//count=1,2
			}
			num /= 10;//last digit removed

		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		count(122, 2);

	}

}
