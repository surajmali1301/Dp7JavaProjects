package com.LabSession_Strings;

public class TrimStringName {

	static void remove(String s) {

		String ans = "";
		String[] str = s.split("\\s");
		for (int i = 0; i < str.length; i++) {
			if (i < str.length - 1) {
				ans = str[i].charAt(0) + ".";// Gets 1st character of word and add "."
			} else {
//getting first character of first,mid name & concating with rest of last name 
				ans = str[i].charAt(0) + str[i].substring(1);
			}
			System.out.print(ans);
		}
	}

	public static void main(String[] args) {

		String s = "Suraj Manohar Mali";

		remove(s);
	}

}
