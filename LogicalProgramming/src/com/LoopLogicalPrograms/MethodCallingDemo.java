package com.LoopLogicalPrograms;

public class MethodCallingDemo {

	public static void main(String[] args) {
		int num = 7;

		fact(num);
	}

	static void fact(int n) {
		long fact = 1;

		for (int i = 1; i <= n; i++) {
			fact *= i;
			System.out.println(fact);
		}

	}
}
