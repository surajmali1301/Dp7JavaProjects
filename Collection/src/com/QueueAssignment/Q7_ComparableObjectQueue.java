package com.QueueAssignment;
//8.	WAP to create a Queue using generics and add user defined 
//class objects which does not implement comparable interface
import java.util.LinkedList;
import java.util.Queue;

class ComparableObj implements Comparable<ComparableObj> {

	@Override
	public int compareTo(ComparableObj other) {

		return 0;
	}
}

public class Q7_ComparableObjectQueue {
	public static void main(String[] args) {
		Queue<ComparableObj> c1 = new LinkedList<>();

		c1.add(new ComparableObj());
		c1.add(new ComparableObj());

		System.out.println("Comparable Object Queue: " + c1);
	}
}
