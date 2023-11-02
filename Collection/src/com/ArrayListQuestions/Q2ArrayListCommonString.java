package com.ArrayListQuestions;

import java.util.ArrayList;

public class Q2ArrayListCommonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> s1 = new ArrayList<>();
		s1.add("Anuj");
		s1.add("Aniket");
		s1.add("Pralay");
		s1.add("Suraj");
		
		ArrayList<String> s2 = new ArrayList<>();
		s2.add("Anuj");
		s2.add("Suraj");
		s2.add("Dipti");
		s2.add("Pratiksha");
		
		
		s2.retainAll(s1);
		System.out.println("Common Names are: "+s2);
	}

}
