package com.Advance;

import java.util.Arrays;

public class RightRotation {

	static void rotate(int a[]) {
		
		int lastE = a[a.length-1];
		
		for (int i = a.length-1; i > 0; i--) {
			a[i]=a[i-1];
		}
		
		a[0]=lastE;
	}
	public static void main(String[] args) {


		int a[]= {1,2,3,6,5,4};
		
		System.out.println("Before: ");
		System.out.println(Arrays.toString(a));
		
		int n=3;
		
		for (int i = 0; i < n; i++) {
			rotate(a);
		}
		System.out.println("-------------------");
		System.out.println("After: ");		
		System.out.println(Arrays.toString(a));

	}

}
