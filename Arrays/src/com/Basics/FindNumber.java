package com.Basics;
import java.util.*;
public class FindNumber {
	
	static void find(int num,int a[]) {
	
		boolean isPresent=false;
		for (int i = 0; i < a.length; i++) {
			if(num==a[i]) {
				isPresent=true;
				System.out.println(num+" is Present at position "+(i+1));
			}
		}
		if(!isPresent) {
			System.out.println(num+" is not present in array");
		}
	}
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int a[]= {1,2,3,4,5,6,1};

		System.out.println("Enter the number to check present or not: ");
		int num = sc.nextInt();

		find(num,a);

	}

}
