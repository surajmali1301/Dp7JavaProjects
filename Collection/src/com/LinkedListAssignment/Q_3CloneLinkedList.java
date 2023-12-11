package com.LinkedListAssignment;

import java.util.LinkedList;

public class Q_3CloneLinkedList {
    public static void main(String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");

        // Clone the linked list
        LinkedList<String> clonedList = new LinkedList<>(originalList);

        System.out.println("Original Linked List: " + originalList);
        System.out.println("Cloned Linked List: " + clonedList);
    }
}
