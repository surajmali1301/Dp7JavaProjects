package com.Assginment_FinalSuperStatic;

 public class StaticAccess {

    // Static variable
    static int staticVariable = 10;

    public static void main(String[] args) {
        System.out.println("Accessing static variable directly: " + staticVariable);

        System.out.println("Accessing static variable using class name: " + StaticAccess.staticVariable);

        StaticAccess obj = new StaticAccess();
        System.out.println("Accessing static variable using an object: " + obj.staticVariable);

        StaticAccess.staticVariable = 20;
        System.out.println("Modified static variable using class name: " + StaticAccess.staticVariable);

        obj.staticVariable = 30;
        System.out.println("Modified static variable using an object: " + obj.staticVariable);

        System.out.println("Accessing modified static variable using class name: " + StaticAccess.staticVariable);

        System.out.println("Accessing modified static variable using an object: " + obj.staticVariable);
    }
}

