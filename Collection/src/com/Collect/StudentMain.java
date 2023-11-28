package com.Collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentMain {

	public static void main(String[] args) {

		ArrayList<Student> aList = new ArrayList<>();
		
		aList.add(new Student(1,"Suraj",70));
		aList.add(new Student(2,"Anuj",60));
		aList.add(new Student(3,"Praly",80));
		aList.add(new Student(4,"Aniket",70));
		aList.add(new Student(5,"Hrishi",60));
		
		
		Iterator<Student> itr = aList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------");
		
		ListIterator<Student> litr = aList.listIterator(aList.size());
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		System.out.println("---------------------------");
		Collections.sort(aList);
		for (Student stud : aList) {
			System.out.println(stud);
		}
	}

}
