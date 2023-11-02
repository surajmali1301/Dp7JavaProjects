package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentCourseMain {

	static  void createCountMap(HashMap<Student,String>hm) {
		HashMap<String,Integer> h1 = new HashMap<>();
		
//		int count;
		
		for (Map.Entry<Student,String> e : hm.entrySet()) {
			String course = e.getValue();
			if(h1.containsKey(course)) {
//				count = h1.get(course);
//				count++;
				h1.put(course, h1.get(course)+1);
			}
			else {
				h1.put(course, 1);
			}
			
		}
		for(Map.Entry<String, Integer> e :h1.entrySet()) {
			System.out.println(e.getKey()+"------>"+e.getValue());
		}
	}
	
	public static void courseStudentMap(HashMap<Student,String> hm) {
		HashMap<String,ArrayList<Student>> h1= new HashMap<>();
		
		ArrayList<Student> studs;
		
		for(Map.Entry<Student, String> e:hm.entrySet()) {
			String course = e.getValue();
			
			if(h1.containsKey(course)) {
				studs=h1.get(course);
			}
			else {
				studs=new ArrayList<>();
			}
			
			studs.add(e.getKey());
			h1.put(course, studs);
		}
		
		for (Map.Entry<String, ArrayList<Student>> e : h1.entrySet()) {
			System.out.println(e.getKey());
			System.out.println("-------------");
			for(Student s:e.getValue())
			{
				System.out.println(e);
			}
			System.out.println("--------------------");
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student, String> sc = new HashMap<>();
		
		sc.put(new Student(1,"Anuj",90),"Java");
		sc.put(new Student(12,"Pralay",90),".net");
		sc.put(new Student(20,"Shivam",90),"Python");
		sc.put(new Student(122,"Suraj",90),".net");
		sc.put(new Student(110,"Hrishikesh",90),"Java");
		
		for (Entry<Student, String> e : sc.entrySet()) {
			System.out.println("Id: " + e.getKey());

			System.out.println("Details: " + e.getValue());
			System.out.println("------------------------------------------------------");
		}

		System.out.println("---------------------------------------------------------");

		createCountMap(sc);
		
		System.out.println("---------------------------------------------------------");

		courseStudentMap(sc);
	}

	}

