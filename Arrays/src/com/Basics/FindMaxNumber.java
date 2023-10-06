package com.Basics;

public class FindMaxNumber {

	static void find(int a[],int max) {
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,9,3,7,5};
		int max=0;
		find(arr,max);
	}
}
