package com.Assignment_Operators;

public class Q8_Operator {

	public static void main(String[] args) {
		int i = 19, j = 29, k;

		k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
//           19 - 18  + 28  - 29  + 18  - 29  + 19  - 28  

		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
	}
}
