package com.ClassCode;

import java.util.*;

class Factors {

	static void fact(int n) {
		int sum = 0;
		int h = 1;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				
				if(i==n)
				{break;}
				sum += i;
				if(i>h) {
					h=i;
				}
				System.out.println("fatcors of "+n+" is "+i);
			}
		}
		System.out.println("sum of factor is: "+sum);
		System.out.println("Highest factors is: "+h);
	}
}

public class FactorsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num = sc.nextInt();

		Factors.fact(num);

	}

}
