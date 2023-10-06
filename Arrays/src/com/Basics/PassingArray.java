package com.Basics;

import java.util.Arrays;

public class PassingArray {

	static void findSquare(int a[]) {

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * a[i];
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7, 9 };

		System.out.println();
		System.out.println(Arrays.toString(a));
		findSquare(a);
	}

}
