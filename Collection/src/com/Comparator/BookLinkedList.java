package com.Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class BookLinkedList {

	public static void main(String[] args) {

		LinkedList<Book> blist = new LinkedList<>();
		blist.add(new Book(101, "TheSecret", 890));
		blist.add(new Book(103, "Ramayan", 250));
		blist.add(new Book(102, "HarryPotter", 1100));
		blist.add(new Book(104, "Life", 250));

		for (Book b : blist) {
			System.out.println(b);
		}

		System.out.println("-------------------------------------");

		Collections.sort(blist);

		for (Book b : blist) {
			System.out.println(b);
		}

		System.out.println("-------------------------------------");

		Collections.sort(blist, new PriceComparator());

		for (Book b : blist) {
			System.out.println(b);
		}

		System.out.println("-------------------------------------");

		Collections.sort(blist, new IdComparator());

		for (Book b : blist) {
			System.out.println(b);
		}

		System.out.println("-------------------------------------");

		Collections.sort(blist, new NameComparator());

		for (Book b : blist) {
			System.out.println(b);
		}

	}

}
