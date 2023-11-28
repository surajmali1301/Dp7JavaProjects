package com.CollectionMasterAssignment;
//11. Sorting a HashSet example
import java.util.HashSet;
import java.util.TreeSet;

public class Q_11SortingHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Apple");
		hashSet.add("Banana");
		hashSet.add("Orange");
		hashSet.add("Grapes");

		TreeSet<String> sortedSet = new TreeSet<>(hashSet);

		System.out.println("Sorted HashSet: " + sortedSet);
	}
}
