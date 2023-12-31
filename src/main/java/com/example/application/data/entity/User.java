package com.example.application.data.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.LinkedList;
import java.util.List;

@Entity
public class User extends Appointment {
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @Email
    @NotEmpty
    private String email;
    private String password;
    private int phoneNumber;

    public User (String first, String last, String emailAddress, String pw, int phone) {
        firstName = first;
        lastName = last;
        email = emailAddress;
        password = pw;
        phoneNumber = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailAddress) {
        email = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pw) {
        password = pw;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phone) {
        phoneNumber = phone;
    }
}
