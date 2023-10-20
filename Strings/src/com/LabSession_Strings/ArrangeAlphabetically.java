package com.LabSession_Strings;

public class ArrangeAlphabetically {

	static boolean arrange(String s) {

		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) > s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "aasb";

		System.out.println(arrange(s));
	}

}
