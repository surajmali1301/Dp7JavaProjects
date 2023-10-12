package com.StringsLogical;

public class FindMostRepeatedWord {

	static void repeated(String st) {

		int maxCount = 0;
		String word = "";
		String starr[] = st.split("\\s");
		int count = 0;
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


		String s =" My country name India and I love my Country";

		repeated(s);
	}

}
