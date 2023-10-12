package com.AbstractClass;

public class Mock {

	static void sum(int a[]) {

		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i += 2) {	
				sum += a[i];
		}
		for (int j = 1; j < a.length; j+=2) {
			sum2+=a[j];
		}
		System.out.println(sum2);
		System.out.println(sum);
	}

	public static void main(String[] args) {

		// write code to calculate sum of alternate element from the array

		int a[] = { 1, 2, 3, 4, 5 };

		sum(a);
	}

}
