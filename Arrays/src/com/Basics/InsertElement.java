package com.Basics;

import java.util.*;

public class InsertElement {
	
	static void shift(int a[],int index,int element) {
	        for (int i = a.length - 1; i > index; i--) {
	            a[i] = a[i - 1];
	        }
	        a[index] = element;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[6];

		System.out.print("Enter the values: ");
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = sc.nextInt();
//			a[2] = 110;

		}
		System.out.println(Arrays.toString(a));
		shift(a,2,100);
		System.out.println(Arrays.toString(a));

	}

}
