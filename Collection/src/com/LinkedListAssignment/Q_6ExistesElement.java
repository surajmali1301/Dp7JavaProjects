package com.LinkedListAssignment;

import java.util.LinkedList;

public class Q_6ExistesElement {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Java");
		linkedList.add("Python");
		linkedList.add("C++");

		String searchElement = "Python";
		boolean exists = linkedList.contains(searchElement);

		System.out.println("Does '" + searchElement + "' exist? " + exists);
	}
}
