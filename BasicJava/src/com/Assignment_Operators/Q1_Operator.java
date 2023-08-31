package com.Assignment_Operators;

public class Q1_Operator {

	public static void main(String s[]) {
		int a = 4;
		a -= 10;// a=a-10-->-6

		a = -a;// -6=+6

		a = 7 + a;// 7+6=13

		a %= a;// a=a%a-->13%13=0 remainder

		a = a * a - 3;// 0*0-3=-3

		System.out.println(" a = " + a);
	}
}
