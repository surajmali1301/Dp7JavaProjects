package com.ArrayList;

import java.util.ArrayList;

public class ReverseLArrayList {

	static void reverse(ArrayList<String>list) {
		
		for (int i = 0,j=list.size()-1; i < list.size()/2; i++,j--) {
			
			String temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}//
	public static void main(String[] args) {


		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Mango");
		al.add("Cherry");
		al.add("Banana");
		al.add("Orange");
		
		reverse(al);
		
		System.out.println(al);

	}

}
