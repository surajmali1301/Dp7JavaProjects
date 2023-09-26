package com.Revision_Codes;

public class ProductOfDigits {

	public static void main(String[] args) {

		int num = 123;
		int pro = 1;
		int count = 0;
		int sum = 0;

		while (num != 0) {

			sum = num % 10;// gives last digit
			System.out.println("Sum: "+sum);//3  2
			pro = pro * sum;
/*			3	=	1 * 3 
 *  		6	=	3 * 2
 *  		6	=	6 *	1*/   
			System.out.println("Pro: "+pro);// final 6

			num /= 10;
		}

		System.out.println("Pro: "+pro);

	}

}
