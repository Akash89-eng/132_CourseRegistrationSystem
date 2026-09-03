package com.registration;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private List<String> registeredSubjects;
    private int totalCredits;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.registeredSubjects = new ArrayList<>();
        this.totalCredits = 0;
    }

    public void addCourse(String subjectName, int credits) {
        this.registeredSubjects.add(subjectName);
        this.totalCredits += credits;
    }

    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public List<String> getRegisteredSubjects() { return registeredSubjects; }
    public int getTotalCredits() { return totalCredits; }
    
    public boolean isEligible() {
        return this.totalCredits >= 15;
    }
}
