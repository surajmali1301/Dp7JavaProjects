package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> st = new ArrayList<>();

		st.add("Mango");
		st.add("Banana");
		st.add("Orange");
		st.add("Kiwi");
		st.add("Apple");

		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
		System.out.println("---------");
		for (String str : st) {
			System.out.println(str);
		}
		System.out.println("---------");
		Iterator<String> it = st.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("---------");
		ListIterator<String> it1 = st.listIterator();

		while (it1.hasPrevious()) {
			System.out.println(it1.next());

		}
		System.out.println("---------");
		ListIterator<String> it2 = st.listIterator(st.size());

		while (it1.hasPrevious()) {
			System.out.println(it1.next());

		}
	}

}
