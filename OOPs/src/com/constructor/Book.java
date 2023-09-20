package com.constructor;




class library{
	
	private int id;
	private String name;
	private float price;
	
//	public library() {
//		int id=101;
//		String name="html";
//		float price=500;
//	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price + "";
	}
	
}
public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		library lb = new library();
		System.out.println(lb);
		

	}

}
