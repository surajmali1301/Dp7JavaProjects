package com.LinkedHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.HashMap.Student;

public class StudentHashMap2 {

	public static void sortByMarks(HashMap<Student,String>hm) {
		
//		TreeMap<Student,String> tm = new TreeMap<>(new MarksComparator());
//		tm.putAll(hm);
//		
//		for(Map.Entru<))
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Student> shm = new HashMap<Integer, Student>();
		
		shm.put(101, new Student(101,"Anuj",90));
		shm.put(107, new Student(101,"Kailas",90));
		shm.put(103, new Student(101,"Pralay",90));
		shm.put(104, new Student(101,"Vishal",90));
		shm.put(105, new Student(101,"Shivam",90));
		
		for (Map.Entry<Integer, Student> e : shm.entrySet()) {
			
			System.out.println(e.getKey()+"--->"+e.getValue());
		}
//		sortByMarks(shm);
	}

}
