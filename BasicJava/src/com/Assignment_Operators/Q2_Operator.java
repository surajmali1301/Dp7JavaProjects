package com.Assignment_Operators;

public class Q2_Operator {

	public static void main(String s[]) {
		int a = 4;
		a++;

		a += a;// 5+5=10

		--a;// 9

		a = 7 + a;// 16

		a *= a;// a=a*a---->16*16=256

		a -= 3;// a=a-a---->256-3=253
		System.out.println(" a = " + a);
	}
}
