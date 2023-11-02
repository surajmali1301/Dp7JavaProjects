package com.LinkedList;

import java.util.LinkedList;

public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Book> bList = new LinkedList<>();
		
		
		bList.add(new Book(1,"Harry Potter",1000f));
		bList.add(new Book(2,"48 Laws of Power",700f));
		bList.add(new Book(3,"Survivor",500f));
		bList.add(new Book(4,"FactFullness",1500f));
		
		for (Book book : bList) {
			System.out.println(book);
		}
	}

}
