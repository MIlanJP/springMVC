package com.springmvc.register.model;

import javax.validation.constraints.*;
import java.util.LinkedHashMap;

public class User {

    public User(String username,
                @NotNull(message = "Please enter the Firstname")
                @Size(min = 5, message = "min 5 characters")String firstName,
                @NotNull(message = "Please enter the lastname")
                @Size(min = 2, message = "min 2 characters") String lastName,
                String contactNo,
                String password,
                @Pattern(regexp = "^[A-z0-9.]+[@][a-zA-Z]+[.][a-z]+",
                        message = "Invalid email") String email) {
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.contactNo = contactNo;
    }

    private String username;

    @Pattern(regexp = "^[A-z0-9.]+[@][a-zA-Z]+[.][a-z]+", message="Invalid email")
    private String email;

    @NotNull(message = "Please enter the Firstname")
    @Size(min = 5,message="min 5 characters")
    private String firstName;

    @NotNull(message = "Please enter the lastname")
    @Size(min = 2,message="min 2 characters")
    private String lastName;

    private String password;

    public User() {
    }

    @NotNull(message = "Please enter the contactNo")
    private String contactNo;

    public String getPassword() {
        return password;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }
}
