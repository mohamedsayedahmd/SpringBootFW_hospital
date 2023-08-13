package com.hospital.patient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Patient {
    // if I send in postman firstName: "something" → we will get null ↓ without code below
    @JsonProperty("firstName") // using postman firstName now (name not work)
    private String name;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Patient(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Patient() {
    }

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
