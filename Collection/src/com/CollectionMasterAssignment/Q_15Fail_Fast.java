package com.CollectionMasterAssignment;
//15. Iterator Fail-Fast Example

import java.util.ArrayList;
import java.util.Iterator;

public class Q_15Fail_Fast {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);

			// Concurrent modification
			if (element.equals("Two")) {
				list.remove(element);
			}
		}
	}
}
