package com.containment_Assignment;

public class Book {

	int bId;
	String bName;
	Author a;
	Book(int bId,String bName,Author a ){
		this.bId=bId;
		this.bName=bName;
		this.a=a;
	}

	public void setBookId(int id) {
		bId=id;
	}
	public int getBookId() {
		return bId;
	}
	public void setBookName(String bName) {
		this.bName=bName;
	}
	public String getBookName() {
		return bName;
	}
	public void setAuthor(Author a) {
		this.a=a;
	}
	public Author getAuthor() {
		return a;
	}
	
	public String toString() {
		return " "+bId+" "+bName+" "+a;
	}
}
