package com.Revision_Codes;

import java.util.*;

public class PrimeOrNot {

	static boolean prime(int n) {
		boolean flag = true;
		if ((n <= 1)) {
			flag = false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
//				System.out.println("N: "+n);
				flag = false;
				break;
			}
		}
		return flag;

	}

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int n=2 ;
//		
////		boolean s = prime(n);
//		if (prime(n)) {
//			System.out.println("Prime");
//		} else {
//			System.out.println("Not prime");
//		}
		System.out.println("Prime number/s from 1 to 5");
		
		for (int i = 1; i <=5; i++) {
			
		if(prime(i)) {
			System.out.println(i);
		}
		}

	}

}
