package com.containment;

public class Library {

	public static void main(String[] args) {


		Author a1 = new Author(1,"JKRowling");
		Author a2 = new Author(2,"Robert Kiyoski");
		
		Book b1 = new Book(11,"HarryPotter",1000f,a1);
		Book b2 = new Book(22,"RichDadPoorDad",500f,a2);

		System.out.println(b1);
		System.out.println("----------------------");
		System.out.println(b2);
		
		Book b3 = new Book(32,"Hamlet",756f, new Author(103,"William Shakespeare"));
	}

}
