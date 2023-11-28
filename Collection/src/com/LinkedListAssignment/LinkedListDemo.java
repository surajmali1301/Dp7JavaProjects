package com.LinkedListAssignment;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> sList = new LinkedList<>();
		sList.add("Java");
		sList.add(".net");
		sList.add("Python");
		sList.add("C++");

		System.out.println(sList);

//1. WAP to append the specified element to the end of a linked list.
		sList.addLast("Ruby");

		System.out.println(sList);
		System.out.println("-----------------");
//2. WAP to iterate through all elements in a linked list.

		Iterator<String> itr = sList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------");
//3. WAP to iterate through all elements in a linked list starting at the specified position.
	
	}

}
