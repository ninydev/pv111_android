package com.itstep.mylists.models;

import java.util.UUID;

public class TechnologyModel {

    private UUID id;

    private String name;

    private int age;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
