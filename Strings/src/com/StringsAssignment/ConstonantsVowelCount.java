package com.StringsAssignment;

public class ConstonantsVowelCount {

	public static void count(String str) {
		int vowels = 0;
		int consonants = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
					System.out.println("vowels:     " + ch);
				} else {
					consonants++;
					System.out.println("consonants: "+ch);
				}
			}
		}
		System.out.println("No.of Vowels: " + vowels);
		System.out.println("No.of consonants: " + consonants);
	}

	public static void main(String[] args) {
		String inputString = "Hello World";
		count(inputString);
	}

}
