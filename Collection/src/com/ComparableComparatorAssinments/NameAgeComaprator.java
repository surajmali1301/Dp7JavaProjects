package com.ComparableComparatorAssinments;

import java.util.Comparator;

public class NameAgeComaprator implements Comparator<Student>{

	@Override
    public int compare(Student s1, Student s2) {
        int nameComparison = s1.getName().compareTo(s2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(s1.getAge(), s2.getAge());
        }
    }
}
