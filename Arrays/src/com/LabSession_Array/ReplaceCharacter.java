package com.LabSession_Array;

public class ReplaceCharacter {//y z with a b

	static void replace(char a[]) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] < 'y') {
				a[i] += 2;

				System.out.println(a[i]);

			}
			if (a[i] >= 'y') {
				a[i] -= 24;
				System.out.println(a[i]);
			}
		}

	}

	public static void main(String[] args) {

		char arr[] = { 'a', 'b', 'c', 'y', 'z' };

		replace(arr);

	}

}
