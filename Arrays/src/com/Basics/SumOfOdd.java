package com.Basics;

public class SumOfOdd {
	
	static void findOdd(int a[]) {
		
		int sum=0;
		for (int i = 0; i < a.length; i+=2) {	
				sum+=a[i];
				System.out.print(a[i]+" ");
				System.out.println(i+" ");
		}
		System.out.println("Sum: "+sum);
		
	}

	public static void main(String[] args) {

//					 1 2 3 4  5  6  7  8  9 10
		int arr[] = {2,4,6,8,10,12,14,16,18,20};
		
		findOdd(arr);

	}

}
