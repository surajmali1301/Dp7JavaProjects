package com.ArrayListAssignment;

import java.util.ArrayList;

//19. WAP to match two collections
public class Q19MatchCollections {

	static void check(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		if (list1.size() == list2.size()) {

			for (int i = 0; i < list1.size(); i++) {

				if (list1.contains(list2)) {
					System.out.println("Both Lists elements are same");
				} else {
					System.out.println("Both Lists element are not same");
				}
				break;
			}
		} else {
			System.out.println("Size of Both lists are diffrent");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> aList = new ArrayList<>();// No elements after creating list

		for (int i = 1; i <= 10; i++) {
			aList.add(i);
		}

		ArrayList<Integer> aList2 = new ArrayList<>();

		aList2.add(1);
		aList2.add(2);
		aList2.add(5);
		aList2.add(6);
		aList2.add(3);
		aList2.add(5);
		aList2.add(6);
		aList2.add(7);
		aList2.add(8);
		aList2.add(9);
//		for (int i = 1; i <= 10; i++) {
//			aList2.add(i);
//		}

		check(aList, aList2);

	}

}
