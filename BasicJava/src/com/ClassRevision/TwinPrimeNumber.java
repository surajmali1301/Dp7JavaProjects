package com.ClassRevision;

import java.util.*;

public class TwinPrimeNumber {

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
		System.out.println("Enter 2nd number: ");
		int num2 = sc.nextInt();

		boolean status=false;
		if (checkPrime(num1))
		{
			if (checkPrime(num2)) 
			{

				if((num2-num1)==2) 
				{
					status=true;
				}
			}
		}
		if(status) {
			System.out.println(num1+" "+num2+" is twin prime number");
		}
		else {
			System.out.println(num1+" & "+num2+" is not twin prime number");
		}
		
		
	}

}
