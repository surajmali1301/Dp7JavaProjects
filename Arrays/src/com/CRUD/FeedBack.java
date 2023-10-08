package com.CRUD;

public class FeedBack {

	private String name;
	private String email;
	private String feedBack;
	private int rating;
	
	FeedBack(){
		
	}

	public FeedBack(String name, String email, String feedBack, int rating) {
		this.name = name;
		this.email = email;
		this.feedBack = feedBack;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FeedBack [name=" + name + ", email=" + email + ", feedBack=" + feedBack + ", rating=" + rating + "]";
	}

	
	
	
}
