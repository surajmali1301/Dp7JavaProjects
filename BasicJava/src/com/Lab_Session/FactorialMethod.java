package com.Lab_Session;

import java.util.Scanner;

public class FactorialMethod {
	
	
	static void fact(int num) {
		
		
		int fact = 1;
		
		for (int i = 1; i <= num; i++) {				
			fact*=i;
		}
		System.out.println("Factorial: "+fact);
//		return fact;//when return type same as declared
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num =sc.nextInt();
		
		fact(num);
		

		


	}

}
