package com.StringsAssignment;

public class LeastRepeatedCharacter {

	static void findLeastRepeated(String str) {
		int minCount = Integer.MAX_VALUE;
		char leastRepeatedChar = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				continue;
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > 0 && count < minCount) {
				minCount = count;
				leastRepeatedChar = str.charAt(i);
			}
		}
		if (leastRepeatedChar != ' ') {
			System.out.println("The least repeated character is: " + leastRepeatedChar);
		} else {
			System.out.println("No characters are repeated.");
		}
	}

	public static void main(String[] args) {
		String s = "My country name India and I love my Country";
		findLeastRepeated(s);
	}
}
