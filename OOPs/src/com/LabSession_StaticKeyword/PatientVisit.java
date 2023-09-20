package com.LabSession_StaticKeyword;

public class PatientVisit {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        System.out.println("Total visits before: " + Doctor.visitCount);

        Patient patient1 = new Patient("Aniket");
        patient1.visitDoctor(doctor);
        System.out.println("Total visits after visit 1: " + Doctor.visitCount);

        Patient patient2 = new Patient("Vishal");
        patient2.visitDoctor(doctor);
        System.out.println("Total visits after visit 2: " + Doctor.visitCount);
    }
}
