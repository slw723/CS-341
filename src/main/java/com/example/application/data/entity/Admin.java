package com.example.application.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Admin {
    @Id
    private String userId;

    @NotEmpty
    private String password;


    public Admin(String id, String pw){
        userId = id;
        password = pw;
    }

    public Admin() { //empty constructor

    }
}
