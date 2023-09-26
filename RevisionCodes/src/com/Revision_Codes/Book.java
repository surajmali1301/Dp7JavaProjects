package com.Revision_Codes;

public class Book {
	int id;
	String name;
	int price;
	int rating;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	void check() {
		if (getRating() > 7) {
			System.out.println(" " + getName());
		}
	}

	public static void main(String[] args) {

		Book b = new Book();
		b.setId(1);
		b.setName("Harry Potter");
		b.setPrice(1000);
		b.setRating(8);
		Book b1 = new Book();
		b1.setId(2);
		b1.setName("Think Again");
		b1.setPrice(500);
		b1.setRating(7);

		b1.check();
		b.check();

	}

}
