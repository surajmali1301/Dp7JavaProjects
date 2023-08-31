package com.Assignment_Operators;

public class Q3_Operator {

	public static void main(String[] args) {
		int i = 11;

		i = i++ + ++i;// 11+13=24
//                  post = +1 + pre = +1 = 11+2=13
		System.out.println(i);
	}
}
