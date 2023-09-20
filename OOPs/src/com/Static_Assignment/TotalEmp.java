package com.Static_Assignment;

public class TotalEmp {
    private int empId;
    private String name;
    private double salary;
    private static int totalEmp = 0;

    public TotalEmp(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        totalEmp++;//Variable name
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }

    public static int totalEmp(){//method name
        return totalEmp;
    }

    public static void main(String[] args) {
        TotalEmp emp1 = new TotalEmp(1, "Aniket", 50000);
        TotalEmp emp2 = new TotalEmp(2, "Vishal", 60000);
        TotalEmp emp3 = new TotalEmp(3, "Shivam", 70000);
        TotalEmp emp4 = new TotalEmp(4, "Pralay", 85000);
        TotalEmp emp5 = new TotalEmp(5, "Suraj", 75000);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();
        emp5.displayInfo();

        System.out.println("Total employees: " + TotalEmp.totalEmp());
    }
}

