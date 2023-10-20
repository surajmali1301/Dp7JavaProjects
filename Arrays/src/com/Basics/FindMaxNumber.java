package com.Basics;

public class FindMaxNumber {

	static void find(int a[],int max) {
		
		for (int i = 0; i < a.length; i++) {//0
			if(a[i]>max) {//1>0 9>1 3>9 10>3 5>10
				max=a[i];//  <--10<--3<--9<--1=a[i]
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,9,3,10,5};
		int max=0;
		find(arr,max);
	}
}
