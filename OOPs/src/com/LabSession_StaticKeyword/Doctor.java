package com.LabSession_StaticKeyword;

class Doctor {
    static int visitCount = 0;

    Doctor() {
        visitCount++;
    }

    void checkup() {
        System.out.println("Doctor is performing a checkup.");
    }
}


