package com.StringsAssignment;

public class MostRepeatedCharacter {

	static void findMostRepeated(String str) {
		int maxCount = 0;
		char mostRepeatedChar = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				continue;//skip ' '
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				mostRepeatedChar = str.charAt(i);
			}
		}
		if (mostRepeatedChar != ' ') {
			System.out.println("The most repeated character is: " + mostRepeatedChar);
		} else {
			System.out.println("No characters are repeated.");
		}
	}

	public static void main(String[] args) {
		String s = "My country name India and I love my Country";
		findMostRepeated(s);
	}
}
