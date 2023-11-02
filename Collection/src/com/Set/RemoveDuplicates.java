package com.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();

		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("Java");

		System.out.println(al);
		System.out.println("---------");
		HashSet<String> hs = new HashSet<>(al);
		System.out.println(hs);
	}

}
