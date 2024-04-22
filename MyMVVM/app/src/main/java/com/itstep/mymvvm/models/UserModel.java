package com.itstep.mymvvm.models;

import java.util.UUID;

public class UserModel {

    public UserModel() {
        this.id = UUID.randomUUID();
    }

    private UUID id;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
