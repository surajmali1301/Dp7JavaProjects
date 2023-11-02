package com.ArrayListAssignment;

import java.util.ArrayList;

public class Q10ArrayListRetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();

		al.add("Orange");
		al.add("Purple");
		al.add("White");
		al.add("Violet");

		ArrayList<String> al2 = new ArrayList<>();

		al2.add("Orange");
		al2.add("Black");
		al2.add("White");
		al2.add("Violet");
		
		al.retainAll(al2);
	
		System.out.println(al);
	}
}
