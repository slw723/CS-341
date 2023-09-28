package com.example.application.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends Appointment {
    private String name;

    public Admin() {

    }

    public Admin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
