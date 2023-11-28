package com.QueueAssignment;
//2.	WAP to create a Queue with some colors (String) &amp; using generics
import java.util.LinkedList;
import java.util.Queue;

public class Q2_UsingGenerics {

	public static void main(String[] args) {
		Queue<String> colorQueue = new LinkedList<>();

		colorQueue.add("Red");
		colorQueue.add("Green");
		colorQueue.add("Blue");

		System.out.println("Color Queue: " + colorQueue);
	}
}
