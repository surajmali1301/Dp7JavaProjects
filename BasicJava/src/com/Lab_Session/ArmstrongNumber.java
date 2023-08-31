package com.Lab_Session;
import java.util.*;
public class ArmstrongNumber {
	
	static void armstrong(int num) {
		int temp=num;
		int temp1=num;
		int sum =0;
		int count = 0;
		
		int sq= 0;
		while (temp != 0)// condition
		{
			temp /= 10;
			count++;//it will count temp oprations until num completely get removed
		}
		while (temp1 != 0) {

			int rem = temp1 % 10;
			int s = 1;
			for (int i = 1; i <= count; i++) {
				s *= rem;
			}
			sum += s;
			temp1 /= 10;

		}
		System.out.println(num == sum ? "armstrong" : "not armstrong");
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		armstrong(num );
		
		

	}

}
