package com.ComparableComparatorAssinments;
//1. WAP to sort the elements of List that contains String objects.Print ArrayList.Sort using 
//Collections.sort(list) method. Print ArrayList
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> bl = new ArrayList<>();
		bl.add("TheSecret");
		bl.add("Ramayan");
		bl.add("HarryPotter");
		bl.add("Life");

		for (String b : bl) {
			System.out.println(b);
		}

		System.out.println("-------------------------------------");

		Collections.sort(bl);

		for (String b : bl) {
			System.out.println(b);
		}
	}

}
