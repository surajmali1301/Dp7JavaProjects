package com.LabSession_Array;

public class Movie {

	int mID;
	String mName;
	float rating;

	Movie(){
		
	}
	public Movie(int mID, String mName, float rating) {
		super();
		this.mID = mID;
		this.mName = mName;
		this.rating = rating;
	}

	public int getmID() {
		return mID;
	}

	public void setmID(int mID) {
		this.mID = mID;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [mID=" + mID + ", mName=" + mName + ", rating=" + rating + "]";
	}

	
}
