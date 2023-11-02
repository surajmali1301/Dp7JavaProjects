package com.AssignmentsHW;

import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cherry");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Date");
		list2.add("Fig");
		list2.add("Grape");

		list1.addAll(list2);

		System.out.println("Joined List: " + list1);
	}
}
