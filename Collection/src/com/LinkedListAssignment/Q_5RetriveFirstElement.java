package com.LinkedListAssignment;

import java.util.LinkedList;

public class Q_5RetriveFirstElement {
	public static void main(String[] args) {
		LinkedList<Double> linkedList = new LinkedList<>();
		linkedList.add(3.14);
		linkedList.add(2.71);
		linkedList.add(1.618);

		Double firstElement = linkedList.peek();

		System.out.println("First Element: " + firstElement);
		System.out.println("Linked List: " + linkedList);
	}
}
