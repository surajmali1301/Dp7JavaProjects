package com.Encapsulation;

public class Book {


	private int bookId;
	private String bName;
	private float price;

	/*
	 * Encapsulation is wraaping data and methods in single unit Example: School Bag
	 */

	public int getBookId() {// getters and setters to public access globally
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBName() {
		return bName;
	}

	public void setBName(String bName) {
		this.bName = bName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
//  use of getters setters 1.individual of access of data 2. Reusable of data

	@Override
	public String toString() {
		return " bookId: " + bookId + ", bName: " + bName + ", price: " + price + "";
	}
}
