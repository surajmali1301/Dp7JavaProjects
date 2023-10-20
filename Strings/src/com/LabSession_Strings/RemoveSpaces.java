package com.LabSession_Strings;

public class RemoveSpaces {

	static void remove(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			
			s=s.replaceAll(" ", "  ");
		}
		System.out.println(s);
	}
	public static void main(String[] args) {


		String str ="My  name   is suraj";

		remove(str);
	}

}
