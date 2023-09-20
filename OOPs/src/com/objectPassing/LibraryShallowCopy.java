package com.objectPassing;

import java.util.Scanner;

import com.Encapsulation.Book;

public class LibraryShallowCopy {

	static void m1(Book b) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the book Id");
		b.setBookId(sc.nextInt());
		
		System.out.println("Enter the book Name");
		b.setBName(sc.next());
		
		System.out.println("Enter the book Price");
		b.setPrice(sc.nextFloat());
		
	}
	public static void main(String[] args) {

		Book b1 = new Book();
		b1.setPrice(1000);
		Book b2=b1;
		m1(b2);

		Book b3 = new Book();
		m1(b3);

		
		System.out.println("-------------------------------------------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		

	}

}
