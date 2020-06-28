package com.springmvc.register.model;

import java.util.LinkedHashMap;

public class User {
    private String country;

    private String username;

    private String firstName;

    private String lastName;

    private String password;

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
