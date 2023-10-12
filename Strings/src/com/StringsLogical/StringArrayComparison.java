package com.StringsLogical;

public class StringArrayComparison {

	static void uniqueString(String str1[], String str2[]) {

		boolean found;

		for (String s1 : str2) {
			found = false;

			for (String s2 : str1) {
				if (s1.equals(s2)) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(s1);
			}
		}
	}

	public static void main(String[] args) {

		String s1[] = { "Neha", "Pralay", "Shrddha", "Shivani", "Aniket" };
		String s2[] = { "Suraj", "Pratiksha", "Dipti", "Neha", "Anuj", "Shivani", "Shivam" };

		uniqueString(s1, s2);
	}

}
