package com.CollectionMasterAssignment;
//1. Sorting Employee objects by empId
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    private int empId;
    private String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee emp) {
        return Integer.compare(this.empId, emp.empId);
    }
}

public class Q_1SortEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> alEmp = new ArrayList<Employee>();
        Employee e1 = new Employee(3, "Ajit");
        Employee e2 = new Employee(4, "Suman");
        Employee e3 = new Employee(2, "Radhika");
        Employee e4 = new Employee(1, "Sameer");
        alEmp.add(e1);
        alEmp.add(e2);
        alEmp.add(e3);
        alEmp.add(e4);

        // Sorting by empId
        Collections.sort(alEmp);
        
        // Displaying sorted list
        for (Employee emp : alEmp) {
            System.out.println("EmpId: " + emp.getEmpId() + ", Name: " + emp.getName());
        }
    }
}
