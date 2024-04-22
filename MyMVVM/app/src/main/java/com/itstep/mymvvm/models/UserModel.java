package com.itstep.mymvvm.models;

import com.itstep.mymvvm.mvvm.OnModelChangeEvent;

import java.util.UUID;

public class UserModel {

    public UserModel() {
        this.id = UUID.randomUUID();
    }

    OnModelChangeEvent viewModel;
    public UserModel (OnModelChangeEvent view) {
        this.viewModel = view;
    }

    public void setViewModel(OnModelChangeEvent viewModel) {
        this.viewModel = viewModel;
    }

    private UUID id;

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if(this.viewModel != null)
            viewModel.onModelChangeEvent();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
        if(this.viewModel != null)
            viewModel.onModelChangeEvent();
    }
}
