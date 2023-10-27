package com.StringsLogical;

import java.util.Arrays;

public class FindMostRepeatedWord {

	static void repeated(String starr[]) {

		int maxCount = 0;
		String word = "";
		int count = 0;

		System.out.println(Arrays.toString(starr));
		for (int i = 0; i < starr.length; i++) {
			if (starr[i].equals("Visited"))
				continue;
			count = 1;

			for (int j = i + 1; j < starr.length; j++) {
				if (starr[i].equalsIgnoreCase(starr[j])) {
					count++;
					starr[j] = "Visited";

				}

			}
//			System.out.println(starr[i] + "------>" + count);

			if (count > maxCount) {
				maxCount = count;
				word = starr[i];

			}

		}
		System.out.println("Most repeate word is: " + word);

	}

	public static void main(String[] args) {

		String s = " My country name India and I love my Country";
		String starr[] = s.split("\\s");

		repeated(starr);
	}

}
