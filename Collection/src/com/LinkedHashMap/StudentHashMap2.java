package com.LinkedHashMap;

import java.util.*;

import com.HashMap.Student;

public class StudentHashMap2 {

	public static void sortByMarks(HashMap<Student,String>hm) {
		
//		TreeMap<Student, String> tm= new TreeMap<>(new MarksComparator());
//		tm.putAll(hm);
//		
//		for(Map.Entry<Student, String> e: tm.entrySet())
//		{
//			System.out.println(e.getKey()+"--->"+e.getValue());
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student,String> shm = new HashMap<>();
		
		shm.put(new Student(101,"Anuj",90),"Java");
		shm.put(new Student(101,"Kailas",90),"Python");
		shm.put(new Student(101,"Pralay",90),"Java");
		shm.put(new Student(101,"Vishal",90),".net");
		shm.put(new Student(101,"Shivam",90),"Python");
		
		for (Map.Entry<Student, String> e : shm.entrySet()) {
			
			System.out.println(e.getKey()+", "+e.getValue()+"]");
		}
		sortByMarks(shm);
	}

}
