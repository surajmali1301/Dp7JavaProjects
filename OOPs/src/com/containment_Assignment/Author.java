package com.containment_Assignment;

public class Author {

	String authName;
	
	Author(String authName){
		this.authName=authName;
	}
	public String toString() {
		return " "+authName;
	}
	
	public static void main(String[] args) {
		
		Author a = new Author("RobertKiyoski");
		Book b = new Book(1,"RichDadPoorDad",a);

		System.out.println(b);
	}
}
