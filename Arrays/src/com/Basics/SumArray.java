package com.Basics;
import java.util.*;
public class SumArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the values: ");
			 arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
	
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum is: "+sum);
		
		float a[]= {3.14f,4.12f};
		
		float sum1=0f;
		
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		System.out.println("Sum of Float: "+sum);

	}

}
