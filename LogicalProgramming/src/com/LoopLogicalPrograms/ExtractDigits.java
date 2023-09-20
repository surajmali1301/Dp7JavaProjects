package com.LoopLogicalPrograms;
import java.util.*;
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

	
	static int reverse(int num) {
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		return rev;
	}


	public static void main(String[] args) {
//		extract(1234);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n==(reverse(n)))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
