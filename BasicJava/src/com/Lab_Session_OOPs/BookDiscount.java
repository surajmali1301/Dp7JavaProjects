package com.Lab_Session_OOPs;

import java.util.*;

class Book {

	int bookId;
	String bookName;
	String bookAuthor;
	String pDate;
	float price;
	char choice;

	public Book(int bookId, String bookName, String bookAuthor, String pDate, float price, char choice) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.pDate = pDate;
		this.price = price;
		this.choice = choice;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setPubDate(String pDate) {
		this.pDate = pDate;
	}

	public String getPubDate() {
		return pDate;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setChoice(char choice) {
		this.choice = choice;
	}

	public char getChoice() {
		return choice;
	}

	public String toString() {
		return " " + bookId + " " + bookName + " " + bookAuthor + " " + pDate + " " + price + " Choice" + choice;
	}
}

public class BookDiscount {

	static void giveDiscount(Book b) {
		if (b.getChoice() == 'S') {
			float dis = b.getPrice();
			dis = dis * .1f;
			b.setPrice(dis);
		}

	}

	public static void main(String[] args) {

		Book b1 = new Book(1, "The Alchemist", "paulo Coello", "1998", 220.0f, 'S');//Write Choice Directly
		Book b2 = new Book(2, "Rich Dad Poor Dad", "Robert Kiyosi", "1997", 370.0f, 'O');
		Book b3 = new Book(3, "Harry Potter", "J.K.Rowling", "26/06/1997", 220.0f, 'S');

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("-------------------------------------------------");

		giveDiscount(b1);
		giveDiscount(b2);
		giveDiscount(b3);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}
