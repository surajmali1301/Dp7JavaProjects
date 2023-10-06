package com.Basics;

import java.util.Arrays;

public class SortArray {
	
	static void sortAscending(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	
static void sortDescending(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {


		int a[]= {7,3,8,9,1,2,5,4,6};
		
		System.out.println("Before: "+Arrays.toString(a));
		System.out.println("------------------------------");
		sortDescending(a);
		System.out.println("Dcending Order: "+Arrays.toString(a));
		System.out.println("----------------------------");
		sortAscending(a);
		System.out.println("Ascending Order: "+Arrays.toString(a));

	}

}
