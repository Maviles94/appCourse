package com.mindhub.appCourse.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name, description;

    @ManyToOne
    private Teacher teacher;
    @OneToMany(mappedBy = "course")
    private Set<WorkShop> workShops = new HashSet<>();


    public Course() {

    }
    public Course(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {

    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {

    }
    public UUID getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Set<WorkShop> getWorkShops() {
        return workShops;
    }
    public void addWorkShop(WorkShop workShop) {
        workShop.setCourse(this);
        workShops.add(workShop);
    }
}
