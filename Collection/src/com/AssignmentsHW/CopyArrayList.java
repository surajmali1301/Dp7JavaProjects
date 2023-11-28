package com.AssignmentsHW;

import java.util.ArrayList;

// 8.WAP to copy one ArrayList into another
public class CopyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);

		ArrayList<Integer> aList2 = new ArrayList<>();
		aList2.addAll(aList);

		for (Integer a : aList2) {
			System.out.println(a);
		}
		
		System.out.println("----------");
		//12.	WAP to empty an ArrayList
		ArrayList<String>aList3 = new ArrayList<>();
		System.out.println(aList3);
		System.out.println("----------------");
		//13.	WAP to trim the capacity of an ArrayList the current list size
		aList2.trimToSize();
		System.out.println(aList2.size());
		System.out.println("-----------------");
		aList.add(6);
		aList.add(7);
		aList.add(8);
		aList.add(9);
		aList.add(10);
		for (Integer a : aList2) {
			System.out.println(a);
		}
		System.out.println("---------------------");
		//16.	WAP to remove the third element from an ArrayList
		aList2.remove(3);
		for (Integer a : aList2) {
			System.out.println(a);
		}
		
		
	}

}
