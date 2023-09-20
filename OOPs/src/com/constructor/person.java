package com.constructor;
import java.util.*;
class person2{
	
	private int id;
	private String name;
	private int age;
	
	
	
	public person2 (){
		int id=101;
		String name ="Suraj";
		int  age = 23;
	}



	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + " ";
	}
	
}

public class person {
	
	

	public static void main(String[] args) {

		person2 p2 = new person2();
		System.out.println(p2);
	
		
		
	}

}
