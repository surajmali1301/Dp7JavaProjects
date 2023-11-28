package com.CollectionMasterAssignment;

import java.util.ArrayList;
import java.util.HashSet;

public class Q_14RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun ");
		al.add("Mon ");
		al.add("Sat ");
		al.add("Sun ");
		al.add("Sat ");
		al.add("Sun ");
		al.add("Mon ");

		HashSet<String> uniqueSet = new HashSet<>(al);
		al.clear();
		al.addAll(uniqueSet);

		System.out.println(al);
	}
}
