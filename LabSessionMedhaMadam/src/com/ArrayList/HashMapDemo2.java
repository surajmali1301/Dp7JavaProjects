package com.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student,Integer> hmap = new HashMap<>();
		
		hmap.put(new Student(1,"Suraj","python"), 60);
		hmap.put(new Student(1,"Aniket","Java"), 70);
		hmap.put(new Student(1,"Kailas",".net"), 90);
		hmap.put(new Student(1,"Vishal","c++"), 40);
		hmap.put(new Student(1,"Jagdish","Java"), 30);
		
		Set<Student> kset = hmap.keySet();
		//ArrayList for fail Student
		ArrayList<String> aList = new ArrayList<>();
		
		
	}

}
