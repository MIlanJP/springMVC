package com.springmvc.register.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

public class User {
    private String country;

    @Min(value = 18 ,message="must be 18 and above")
    @Max(value=40,message="Must Be below 41")
    private int age;
    private String username;

    @NotNull(message = "Please enter the Firstname")
    @Size(min = 5,message="min 5 characters")
    private String firstName;

    @NotNull(message = "Please enter the lastname")
    @Size(min = 1,message="min 5 characters")
    private String lastName;

    private String password;
    private String[] habits;

    public String[] getHabits() {
        return habits;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    private LinkedHashMap<String, String> countryOptions;

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public User() {
        countryOptions=new LinkedHashMap<String,String>();
        countryOptions.put("IND","INDIA");
        countryOptions.put("USA","America");
        countryOptions.put("FR","France");
        countryOptions.put("BR","Brazil");

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
}
