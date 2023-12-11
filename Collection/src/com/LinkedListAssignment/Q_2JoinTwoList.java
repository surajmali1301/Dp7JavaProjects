package com.LinkedListAssignment;

import java.util.LinkedList;

public class Q_2JoinTwoList {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(3);
		list2.add(4);

		list1.addAll(list2);

		System.out.println("Joined Linked List: " + list1);
	}
}
