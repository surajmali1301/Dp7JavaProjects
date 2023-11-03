package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BookAuthorHashMap {

	public static void createMap(ArrayList<Book> bl) {
		
		HashMap<Author,Book> h1 = new HashMap<>();
		
		ArrayList<Book> books;
		
		for (Book b : bl) {
			if(h1.containsKey(b.getAuthor())) {
//				books=h1.get(b.getAuthor());
			}
			else {
				books = new ArrayList<>();
			}
//			books.add(b);
//			h1.put(b.getAuthor(), books);
		}
		
		for(Map.Entry<Author, Book> e:h1.entrySet()) {
			System.out.println(e.getKey());
			System.out.println("-----------");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book(1, "Harry Potter", 1043, new Author(1,"JK Rowling")));
		list.add(new Book(2, "Hamlet", 890, new Author(2,"William Shakespeare")));
		list.add(new Book(1, "Fantastic Beasts", 1043, new Author(3,"JK Rowling")));
		list.add(new Book(1, "Othello", 1043, new Author(4,"William Shakespeare")));
		
		createMap(list);
	}

}
