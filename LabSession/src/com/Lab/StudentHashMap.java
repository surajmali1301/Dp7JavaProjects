package com.Lab;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student, Integer> hmap = new HashMap<>();
		hmap.put(new Student(1,"Suraj","Java"),75);
		hmap.put(new Student(2,"Shivam","html"),80);
		hmap.put(new Student(3,"Ram","Java"),35);
		hmap.put(new Student(4,"Kailas","python"),80);
		hmap.put(new Student(5,"Pralay",".net"),59);
		
		HashMap<String,Integer> passMap = new HashMap<>();
		HashMap<String,Integer> failMap = new HashMap<>();
		
		for (Map.Entry<Student,Integer> s: hmap.entrySet()) {
		
			if(s.getValue()>=40) {
				passMap.put(s.getKey().getName(), s.getValue());
			}
			else {
				failMap.put(s.getKey().getName(), s.getValue());
			}
		}
		System.out.println(failMap);
		System.out.println(passMap);
	}

}
