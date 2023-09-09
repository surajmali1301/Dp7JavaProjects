package com.LoopLogicalPrograms;

import java.util.*;

public class RevisionCode {

	public static int calculate(int num) {

		while (num >= 10) {// until number is greater than or equal to 10----->9999---999---99--9---end
			int sum = 0;
			while (num > 0) {//getting last digit and adding in sum
				int rem = num % 10;
				sum += rem;
				num /= 10;//removing last digit
			}
			num = sum;//"num" have now sum of digit 
		}

		return num;//return num //bcz retrun type is return type is int
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int ans = calculate(num);
		System.out.println(ans);

	}

}
