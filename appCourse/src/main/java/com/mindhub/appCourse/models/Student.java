package com.mindhub.appCourse.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Student extends Person{

    private String lastname;

    @ManyToMany(mappedBy = "students")
    private Set<WorkShop> workShop = new HashSet<>();

    public Student() {
    }

    public Student(String name, String email, String password) {
        super(name, email, password);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Set<WorkShop> getWorkShop() {
        return workShop;
    }

    public void addWorkShop(WorkShop workShop) {
        workShop.getStudents().add(this);
        this.workShop.add(workShop);
    }

}

