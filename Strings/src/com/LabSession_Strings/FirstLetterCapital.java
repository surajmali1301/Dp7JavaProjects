package com.LabSession_Strings;

public class FirstLetterCapital {

	static void capital(String str) {

		String s[] = str.split("\\s");
		String word = "";

		
		for (String str1 : s) {
			char c = Character.toUpperCase(str1.charAt(0));
			String s2 = str1.substring(1).toLowerCase();
			word = c + s2 + " ";
			System.out.print(word);
		}
		
	}

	public static void main(String[] args) {

		String s = "india is beautiful country";

		capital(s);
	}

}
