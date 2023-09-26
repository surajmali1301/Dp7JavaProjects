package com.Revision_Codes;

import java.util.*;

public class KrishnamurthyNumber {

	static void krishnamurthy(int orignalNum) {
		int count = 0;
		int num1 = orignalNum;
		int num2 = orignalNum;
		int sum = 0;
		
		while (num2 != 0) {

			int rem = num2 % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum+=fact;
			System.out.println("rem: "+rem+", fact: "+fact);
			System.out.println("sum: "+sum);
			num2/=10;
		}
		if(sum==orignalNum)
			System.out.println("Krishnamurthy");
		else
			System.out.println("Not Krishnamurthy");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		krishnamurthy(num);

	}

}
