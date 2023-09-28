package com.example.application.data.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import java.util.LinkedList;
import java.util.List;

@Entity
public class User extends Appointment {
    @NotBlank
    private String name;

    @OneToMany(mappedBy = "company")
    @Nullable
    private List<ServiceProvider> employees = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ServiceProvider> getEmployees() {
        return employees;
    }

    public void setEmployees(List<ServiceProvider> employees) {
        this.employees = employees;
    }
}
