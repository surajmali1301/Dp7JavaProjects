package com.containment;

public class Book {

	int id;
	String name;
	float price;
	private Author a;
	Book(){
		
	}
	Book(int id,String name,float price,Author a){
		this.id=id;
		this.name=name;
		this.price=price;
		this.a=a;
	}
	public int getBid() {
		return id;
	}
	public void setBid(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setAuthor(Author a) {
		this.a=a;
	}
	public Author getAuthor() {
		return a;
	}
	
	public String toString() {
		return "\nBookDetails: "+"\nBookId: "+id+"\nBookName: "+name+"\nBookPrice: "+price+"\nAuthorDetails: "+a; 
	}
}
