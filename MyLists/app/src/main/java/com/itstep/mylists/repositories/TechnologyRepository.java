package com.itstep.mylists.repositories;

import com.itstep.mylists.models.TechnologyModel;

import java.util.ArrayList;
import java.util.UUID;

public class TechnologyRepository {

    ArrayList<TechnologyModel> data;

    public static TechnologyModel createModel() {
        TechnologyModel newModel = new TechnologyModel();
        newModel.setId(UUID.randomUUID());
        return newModel;
    }

    public void add(TechnologyModel model) {
        data.add(model);
    }


    private void seed() {
        TechnologyModel java = new TechnologyModel();
        java.setId(UUID.randomUUID());
        java.setName("Java");
        java.setAge(30);
        data.add(java);

        TechnologyModel php = new TechnologyModel();
        php.setId(UUID.randomUUID());
        php.setName("PHP");
        php.setAge(30);
        data.add(php);

        TechnologyModel react = new TechnologyModel();
        react.setId(UUID.randomUUID());
        react.setName("React");
        react.setAge(20);
        data.add(react);
    }

    private TechnologyRepository() {
        data = new ArrayList<>();
        seed();
    }

    private static TechnologyRepository instance;

    public static TechnologyRepository getInstance() {
        if (instance == null) {
            instance = new TechnologyRepository();
        }
        return instance;
    }

    public ArrayList<TechnologyModel> getData() {
        return data;
    }
}
