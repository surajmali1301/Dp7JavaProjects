package com.Loops;

public class Print_1To20_UsingContinue {

	public static void main(String[] args) {

		for (int i = 0; i <= 20; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}

	}

}
