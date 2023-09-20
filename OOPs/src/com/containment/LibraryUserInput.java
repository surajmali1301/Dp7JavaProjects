package com.containment;
import java.util.*;
public class LibraryUserInput {
	
	static Scanner sc = new Scanner(System.in);
	void enterBookDetails(Book b) {
		System.out.println("Enter the Book Id..");
		b.setBid(sc.nextInt());
		
	}

	public static void main(String[] args) {


		

	}

}
