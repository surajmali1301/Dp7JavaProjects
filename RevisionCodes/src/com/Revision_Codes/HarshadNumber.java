package com.Revision_Codes;
import java.util.*;
public class HarshadNumber {
	
	static int checkNumber(int num) {
		int sum=0;
		while (num>0) {
			int rem = num%10;
			
			sum=sum+rem;
			num/=10;
		}
		
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		

		int sum = checkNumber(num);
		
		if(num%sum==0) {
			System.out.println(num+" is harshad number");
		}
		else {
			System.out.println(num+" is not harshad number");
		}
		

		
		

	}

}
