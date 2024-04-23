package com.itstep.mylists.viewmodels;

import android.content.Context;

import com.itstep.mylists.repositories.TechnologyRepository;

public class TechnologyViewModel {

    private final TechnologyRepository repository;
    private final Context context;

    public TechnologyViewModel(Context context) {
        this.context  = context;
        this.repository = TechnologyRepository.getInstance();
    }


}
