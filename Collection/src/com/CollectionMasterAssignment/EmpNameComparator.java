package com.CollectionMasterAssignment;

import java.util.Comparator;

class EmpNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}