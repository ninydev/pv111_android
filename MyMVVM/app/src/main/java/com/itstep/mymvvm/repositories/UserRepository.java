package com.itstep.mymvvm.repositories;

import com.itstep.mymvvm.models.UserModel;

import java.util.ArrayList;

public class UserRepository {

    protected ArrayList<UserModel> models;

    public ArrayList<UserModel> getData() {
        return this.models;
    }


    protected UserRepository(){
        models = new ArrayList<>();
    }

    public static UserModel createModel () {
        return new UserModel();
    }

    static protected UserRepository instance;

    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }

        return instance;
    }
}
