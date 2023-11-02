package com.ArrayListQuestions;

import java.util.ArrayList;
import java.util.List;

//Q5. Create a non generic arraylist and show the usage of creating generics
public class Q5NonGenericArrayList {

	public static void main(String[] args) {

		List list = new ArrayList<>(); // non-generic ArrayList

		list.add("Hello Java");
		list.add(42);
		list.add(3.14);
		System.out.println("Non-generic ArrayList: " + list);

		for (int i = 0; i < list.size(); i++) {
			int data = (int) list.get(i) + 10;
			list.set(i, data);
		}
		System.out.println(list);

	}
}
