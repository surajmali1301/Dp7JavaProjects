package com.Lab_Session;

public class PellNumber {

	public static void main(String[] args) {

		int count =100;
		int num1 = 0;
		int num2 = 1;
		int next = 0;

		System.out.println(num1 + " ");
		System.out.println(num2 + " ");

		for (int i = 1; i <= count; i++) {
			next = 2 * num2 + num1;// to get pell numbers

			if(next>count) {
				break;
			}
			System.out.println(next + " ");
			num1 = num2;
			num2 = next;
		}
	}

}
