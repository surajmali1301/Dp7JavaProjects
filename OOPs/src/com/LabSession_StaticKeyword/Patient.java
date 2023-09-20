package com.LabSession_StaticKeyword;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }

    void visitDoctor(Doctor doctor) {
        System.out.println(name + " is visiting the doctor.");
        doctor.checkup();
    }
}

