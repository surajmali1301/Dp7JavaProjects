package com.TQ;

public class Movie {
	int yearOfRelease;
	String name;
	String actor;
	float collection;
	
	
	void accept(int y,String n,String a,float c) {
		yearOfRelease = y;
		name = n;
		actor = a;
		collection =c;
	}
	
	void show() {
		System.out.println("Release date: "+yearOfRelease);
		System.out.println("Movie name: "+name);
		System.out.println("Actor Name: "+actor);
		System.out.println("Box office collection: "+collection);
	}

	public static void main(String[] args) {
		
		Movie inception = new Movie();
		inception.accept(2010, "Inception", "LeonardoDicaprio", 1600000f);
		inception.show(); 
	}

}
