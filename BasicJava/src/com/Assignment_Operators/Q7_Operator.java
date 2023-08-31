package com.Assignment_Operators;

public class Q7_Operator {

	public static void main(String[] args) {
		int a = 1, b = 2;

		System.out.println(--b - ++a + ++b - --a);
		                // 1   - 2   +  2  - 1
	}//						(2nd)			(1st)       2-1=1+1=2-2=0<------
}
