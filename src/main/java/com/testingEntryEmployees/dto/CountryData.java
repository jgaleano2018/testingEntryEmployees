package com.testingEntryEmployees.dto;

public class CountryData {

    private Long id;
    private String identificationCard;
    private String firstName;
    private String lastName;
    private String email;

    public CountryData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}