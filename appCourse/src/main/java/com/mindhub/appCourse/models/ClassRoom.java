package com.mindhub.appCourse.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String number;
    private Integer capacity;

    @OneToMany(mappedBy = "classRoom")
    private Set<WorkShop> workShops = new HashSet<>();


    public ClassRoom() {
    }

    public ClassRoom(String number, Integer capacity) {
        this.number = number;
        this.capacity = capacity;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {

    }
    public Integer getCapacity() {
        return capacity;
    }
    public void setCapacity(Integer capacity) {

    }
    public UUID getId() {
        return id;
    }

    public Set<WorkShop> getWorkShops() {
        return workShops;
    }
    public void addWorkShop(WorkShop workShop) {
        workShop.setClassRoom(this);
        workShops.add(workShop);
    }
}
