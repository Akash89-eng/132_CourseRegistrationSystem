package com.registration;

import java.util.Scanner;

public class CourseRegistrationSystem {

    public static void displayRegistrationDetails(Student student) {
        System.out.println("\n========== REGISTRATION SUMMARY ==========");
        System.out.println("Student Name : " + student.getName());
        System.out.println("Student ID   : " + student.getStudentId());
        System.out.println("Subjects     : " + String.join(", ", student.getRegisteredSubjects()));
        System.out.println("Total Credits: " + student.getTotalCredits());
        
        if (student.isEligible()) {
            System.out.println("Status       : ELIGIBLE (Minimum 15 credits met)");
        } else {
            System.out.println("Status       : NOT ELIGIBLE (Below 15 credits requirement)");
        }
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();

        Student student = new Student(name, id);

        System.out.print("How many subjects do you want to add? ");
        int subjectsCount = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < subjectsCount; i++) {
            System.out.println("\n--- Subject " + (i + 1) + " ---");
            System.out.print("Enter Subject Name: ");
            String subjectName = scanner.nextLine();
            System.out.print("Enter Credit Value: ");
            int credits = scanner.nextInt();
            scanner.nextLine(); 

            student.addCourse(subjectName, credits);
        }

        displayRegistrationDetails(student);
        scanner.close();
    }
}
