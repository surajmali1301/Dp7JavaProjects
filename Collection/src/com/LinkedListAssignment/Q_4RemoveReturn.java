package com.LinkedListAssignment;

import java.util.LinkedList;

public class Q_4RemoveReturn {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        Integer removedElement = linkedList.poll();

        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated Linked List: " + linkedList);
    }
}
