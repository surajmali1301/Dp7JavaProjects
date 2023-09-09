package com.Lab_Session_OOPs;

class Movie{
	
	int movieId;
	String movieName;
	float rating;
	
	public Movie(int movieId,String movieName,float rating) {
		this.movieId=movieId;
		this.movieName=movieName;
		this.rating=rating;
	}
	public void setMoieId(int movieId) {
		this.movieId=movieId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setName(String movieName) {
		this.movieName=movieName;
	}
	public String getName() {
		return movieName;
	}
	public void setRating(float rating) {
		this.rating=rating;
	}
	public float getRating() {
		return rating;
	}
	
	public String toString() {
		return " "+movieId+" "+movieName+" "+rating;
	}
	
	
}
public class checkRating {
	
	static void rating(Movie m) {
		if(m.getRating()>7) {
			System.out.println(m);
		}
	}

	public static void main(String[] args) {


		Movie m1 = new Movie(7,"  Inception",8.5f);
		Movie m2 = new Movie(9,"  Army of Thieves",6.5f);
		Movie m3 = new Movie(1,"  Intersteller",9.0f);
		Movie m4 = new Movie(300,"300",7.5f);
		Movie m5 = new Movie(23," Taxi Driver",9.0f);
		
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		
	System.out.println("----Movies Rating above 7----\n");	
		rating(m1);
		rating(m2);
		rating(m3);
		rating(m4);
		rating(m5);


	}

}
