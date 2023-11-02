package com.Vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {


		Vector<String> lang = new Vector<>(5);
		
		lang.add("c");
		lang.add("c++");
		lang.add("python");
		lang.add("Angular");
		lang.add(".net");
		
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("Ruby");
		
		System.out.println("------------------");
		
		System.out.println(lang.capacity());//doubles capacity
		System.out.println(lang.size());
		
		System.out.println("------------------");
		
		System.out.println(lang.get(3));
		System.out.println(lang.elementAt(4));
		
		System.out.println("------------------");
		
		System.out.println(lang.remove(0));
		System.out.println(lang.removeElement(3));
		
		System.out.println("------------------");
		
		System.out.println(lang.set(0, "ReactJs"));
		
		lang.setElementAt("C#", 4);
		
		System.out.println(lang);
		
	}

}
