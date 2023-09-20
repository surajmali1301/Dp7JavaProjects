package com.containment;

public class LibraryGetterSetter {

	public static void main(String[] args) {


		Author a = new Author();
		a.setId(1);
		a.setName("JKRowling");
		Book b = new Book(1,"HarryPotters",1000f,a);
		
		System.out.println(b);

	}

}
