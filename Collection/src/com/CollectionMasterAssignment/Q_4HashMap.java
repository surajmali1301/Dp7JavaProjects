package com.CollectionMasterAssignment;
import java.util.HashMap;
//4. Output of HashMap program
public class Q_4HashMap {
    public static void main(String[] args) {
        HashMap obj = new HashMap();
        obj.put("A", new Integer(1));
        obj.put("B", new Integer(2));
        obj.put("A", new Integer(4));
        obj.put("C", new Integer(3));
        System.out.println(obj);
    }
}
