package com.Basics;

public class EnhanceForLoop {

	static void divsibility(int a[]) {

		for (int i : a) {

			if (i % 3 == 0) {
				System.out.println(i);
			}

		}
	}

	public static void main(String[] args) {

		int a[] = { 3, 5, 6, 7, 10, 12 };
		divsibility(a);
	}
}
