package com.LoopLogicalPrograms;

public class ReturnType_Method {

	static long fact(int n) {// formal dummy argument
		long fact = 1;

		for (int i = 1; i <= n; i++) {
			fact *= i;

		}
		return fact;// last statement

	}

	public static void main(String[] args) {
		long ans;

		ans = fact(7);
		System.out.println("factorial: " + ans);
	}

}
