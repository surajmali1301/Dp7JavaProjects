package com.Encapsulation;
import java.util.*;
public class Library {

	public static void main(String[] args) {

//		Book b1 = new Book();
//		b1.setBookId(100);
//		b1.setBName("OnePiece");
//		b1.setPrice(1000);
//
//		System.out.println("Book Id:"+b1.getBookId() + " "+"Book Name:" + b1.getBName() + " "+"Book Price:" + b1.getPrice());
		
		
		Book b2  = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book Id");
		b2.setBookId(sc.nextInt());
		
		System.out.println("Enter the book Name");
		b2.setBName(sc.next());
		
		System.out.println("Enter the book Price");
		b2.setPrice(sc.nextFloat());
		
		System.out.println(b2);
	}

}
