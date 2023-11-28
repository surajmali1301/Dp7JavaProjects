package com.QueueAssignment;
//1.	WAP to create a Queue with Integer objects without using generics
import java.util.LinkedList;
import java.util.Queue;

public class Q1_WithoutGenerice {

	public static void main(String[] args) {
		Queue integerQueue = new LinkedList();

		integerQueue.add(5);
		integerQueue.add(10);
		integerQueue.add(15);

		System.out.println("Integer Queue: " + integerQueue);
	}
}
