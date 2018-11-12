package com.dhbw.mdse;

import com.dhbw.mdse.domain.engineer.Engineer;
import com.dhbw.mdse.domain.engineer.Software;
import com.dhbw.mdse.domain.student.Course;
import com.dhbw.mdse.domain.student.Student;

import java.util.List;

public class TestData {

    public static Student student() {
        List<Course> courses = List.of(new Course("mdse", "presentation"));
        return new Student("Max Muster", 22, "DHBW Mannheim", courses);
    }

    public static Engineer engineer() {
        List<Software> software = List.of(new Software("Linux", "GPL v2"), new Software("Git", "GPL v2"));
        return new Engineer("Linus Torvalds", 48, software);
    }
}
