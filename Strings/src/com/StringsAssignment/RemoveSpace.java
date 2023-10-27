package com.StringsAssignment;

public class RemoveSpace {

	public static void main(String[] args) {


		String str ="Java Is Programming  Language";

		String final1 =str.replaceAll("\\s", "");
		
		System.out.println(final1);
	}

}
