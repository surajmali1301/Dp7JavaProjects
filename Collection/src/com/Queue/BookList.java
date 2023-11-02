package com.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class BookList  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Book> bList = new PriorityQueue<>(new PriceComparator());

		bList.add(new Book(1, "Harry Potter", 1000f));
		bList.add(new Book(2, "48 Laws of Power", 700f));
		bList.add(new Book(3, "Survivor", 500f));
		bList.add(new Book(4, "FactFullness", 1500f));

		for (Book book : bList) {
			System.out.println(book);
		}
	}
}
