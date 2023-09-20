package com.Assginment_FinalSuperStatic;

 public class StaticAccess {

    // Static variable
    static int staticVariable = 10;

    public static void main(String[] args) {
        // Accessing static variable directly
        System.out.println("Accessing static variable directly: " + staticVariable);

        // Accessing static variable using class name
        System.out.println("Accessing static variable using class name: " + StaticAccess.staticVariable);

        // Accessing static variable using an object
        StaticAccess obj = new StaticAccess();
        System.out.println("Accessing static variable using an object: " + obj.staticVariable);

        // Modifying static variable using class name
        StaticAccess.staticVariable = 20;
        System.out.println("Modified static variable using class name: " + StaticAccess.staticVariable);

        // Modifying static variable using an object
        obj.staticVariable = 30;
        System.out.println("Modified static variable using an object: " + obj.staticVariable);

        // Accessing modified static variable using class name
        System.out.println("Accessing modified static variable using class name: " + StaticAccess.staticVariable);

        // Accessing modified static variable using an object
        System.out.println("Accessing modified static variable using an object: " + obj.staticVariable);
    }
}

