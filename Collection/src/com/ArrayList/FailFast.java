package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("Html");

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {

			if (itr.next().equals("Angular")) {

//				al.remove("Angular"); java.util.ConcurrentModificationException
			}
		}
		System.out.println(al);
	}

}
