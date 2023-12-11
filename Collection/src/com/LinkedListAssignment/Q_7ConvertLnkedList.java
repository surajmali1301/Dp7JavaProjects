package com.LinkedListAssignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class  Q_7ConvertLnkedList{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);

        System.out.println("Linked List: " + linkedList);
        System.out.println("ArrayList: " + arrayList);
    }
}
