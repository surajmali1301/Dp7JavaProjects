package com.Static_Assignment;

public class EmpIdGeneration {
    private int empId;
    private String name;
    private double salary;
    static int newIdGen = 0;
    static int total_employees = 0;

    public EmpIdGeneration(String name, double salary) {
        this.name = name;
        this.salary = salary;
        newIdGen++;
        this.empId = newIdGen;
        total_employees++;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }

    public static int totalEmp() {
        return total_employees;
    }

    public static void main(String[] args) {
    	EmpIdGeneration emp1 = new EmpIdGeneration("John Doe", 50000);
    	EmpIdGeneration emp2 = new EmpIdGeneration("Jane Smith", 60000);
    	EmpIdGeneration emp3 = new EmpIdGeneration("Bob Johnson", 70000);
    	EmpIdGeneration emp4 = new EmpIdGeneration("Mary Brown", 55000);
    	EmpIdGeneration emp5 = new EmpIdGeneration("Michael Davis", 65000);

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();
        emp5.displayInfo();

        System.out.println("Total employees: " + EmpIdGeneration.totalEmp());
    }
}
