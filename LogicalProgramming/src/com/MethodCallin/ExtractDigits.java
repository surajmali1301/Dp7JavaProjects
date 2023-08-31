package com.MethodCallin;

public class ExtractDigits {

	static void extract(int num) {
		System.out.println("digis: " + num);

		while (num != 0) {
			System.out.println(num % 10);// give digits from last
			num = num / 10;// remove last digit
		}
	}

	static void palind(int num) {

		int original = num;
		System.out.println("Check Palindrome");
		int rev=0;
		
		while(num!=0)
		{
//			rev=
		}
	}

	static void reverse(int num) {

		
	}

	public static void main(String[] args) {
		extract(1234);
	}

}
