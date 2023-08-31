package com.Assignment_Operators;

public class Q5_Operator {

	public static void main(String[] args) {
		int i = 0;
		i = i++;
		System.out.println(i);// 0
		i = --i;// 0-->-1
		System.out.println(i);//-1
		i = ++i;// --1--->0
		System.out.println(i);// 0
		i = i--;// 0
		System.out.println(i);//0
		i = i++ - --i + ++i - i--;
		// 0 - -1 + 0 - 0

		System.out.println(i);//0

	}
}
