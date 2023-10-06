package com.Revision_Codes;
import java.util.*;
public class ArmstrongNumber {
	
	static void armstrong(int num) {
		int temp=num;
		int temp1=num;
		int sum =0;
		int count = 0;
		
		
		while (temp != 0)// condition
		{
			temp /= 10;
			count++;//it will count temp operations until numb completely get removed
		}
//		System.out.println(temp);//0 
		
		
		while (temp1 != 0) {//using new temp1 variable because temp is 0;

			int rem = temp1 % 10;
			int product = 1;
			for (int i = 1; i <= count; i++) {
				product = product*rem;

			}
			sum = sum+product;// after addition of product

			temp1 /= 10;

		}
		
		System.out.println(num == sum ? "armstrong" : "not armstrong");
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		armstrong(num);
			
		}
		
		

	}


