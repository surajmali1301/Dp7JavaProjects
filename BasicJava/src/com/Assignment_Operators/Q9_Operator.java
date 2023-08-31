package com.Assignment_Operators;

public class Q9_Operator {

	public static void main(String[] args) {
		int m = 0, n = 0;

		int p = --m * --n * n-- * m--;
//              -1  * -1  * -1  * -1
		System.out.println(p);// 1
	}
}
