package com.containment;

public class Author {

	private int authorId;
	private String authorName;
	
	Author(){
		
	}
	Author(int authorId,String authorName){
		this.authorId=authorId;
		this.authorName=authorName;
	}
	public void setId(int authorId) {
		this.authorId=authorId;
	}
	public int getId() {
		return authorId;
	}
	public void setName(String authorName) {
		this.authorName=authorName;
	}
	public String getName() {
		return authorName;
	}
	
	public String toString() {
		return "\nAuthorId: "+authorId+"\nAuthorName: "+authorName;
	}
}
