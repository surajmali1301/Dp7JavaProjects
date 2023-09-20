package com.ClassRevision;

import java.util.Scanner;

public class TwinPrime2 {

	static boolean checkPrime(int n) {
		boolean status = true;
		if ((n == 0) || n == 1) {
			status = false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
			}

		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number: ");
		int num1 = sc.nextInt();
	

		
		boolean status=false;
		
			if (checkPrime(num1)) {
				System.out.println("prime");
				if(checkPrime(num1+2)) {
					System.out.println((num1+2)+" is prime");
				}
				
			}
		
		
		
		
	}

}
