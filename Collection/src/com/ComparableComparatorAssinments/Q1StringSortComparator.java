package com.ComparableComparatorAssinments;

import java.util.Comparator;

public class Q1StringSortComparator implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getName().compareTo(b2.getName());
	}



}
