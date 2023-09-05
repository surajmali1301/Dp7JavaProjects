package com.LoopLogicalPrograms;

public class ExtractDigits {

//	static void extract(int num) {
//		System.out.println("digits: " + num);
//
//		while (num != 0) {
//			System.out.println(num % 10);// give digits from last
//			num = num / 10;// remove last digit
//			System.out.println("num: "+num);
//		}
//	}

	static void palind(int num) {

		int original = num;
		int rev=0;
		int rem = num%10;
		while(num!=0)
		{
			rev=rev*10+rem;
		}
		if (rev==original) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

	static void reverse(int num) {

		
	}

	public static void main(String[] args) {
//		extract(1234);
		palind(121);
	}

}
