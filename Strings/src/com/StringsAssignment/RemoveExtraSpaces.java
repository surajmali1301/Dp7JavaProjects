package com.StringsAssignment;

public class RemoveExtraSpaces {

	public static String removeExtraSpaces(String str) {
		return str.replaceAll("\\s+", " ").trim();
	}

	public static void main(String[] args) {
		String str = "	Java is Programming Language	";
		String trimmedString = removeExtraSpaces(str);
		System.out.println("Original String: \"" + str + "\"");
		System.out.println("String with extra spaces removed: \"" + trimmedString + "\"");
	}
}
