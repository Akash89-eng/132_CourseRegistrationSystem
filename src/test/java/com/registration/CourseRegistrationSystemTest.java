package com.registration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseRegistrationSystemTest {

    @Test
    public void testEligibleRegistration() {
        Student student = new Student("Rahul", "STU101");
        student.addCourse("Agile Development", 4);
        student.addCourse("DevOps Process", 4);
        student.addCourse("Cloud Computing", 4);
        student.addCourse("Capstone Project", 4); // Total = 16 credits
        
        assertTrue(student.isEligible());
        assertEquals(16, student.getTotalCredits());
    }

    @Test
    public void testIneligibleRegistration() {
        Student student = new Student("Sita", "STU102");
        student.addCourse("Mathematics", 4);
        student.addCourse("Physics", 3); // Total = 7 credits
        
        assertFalse(student.isEligible());
        assertEquals(7, student.getTotalCredits());
    }
}
