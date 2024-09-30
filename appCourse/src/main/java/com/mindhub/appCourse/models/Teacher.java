package com.mindhub.appCourse.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Teacher extends Person{
    private String Speciality;


    @OneToMany(mappedBy = "teacher")
    private Set<Course> courses = new HashSet<>();

    public Teacher() {
    }

    public Teacher(String name, String email, String password, String speciality) {
        super(name, email, password);
        Speciality = speciality;
    }
    public String getSpeciality() {
        return Speciality;
    }
    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public Set<Course> getCourses() {
        return courses;
    }
    public void addCourse(Course course) {
        course.setTeacher(this);
        courses.add(course);
    }

}
