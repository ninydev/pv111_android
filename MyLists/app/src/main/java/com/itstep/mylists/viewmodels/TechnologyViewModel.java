package com.itstep.mylists.viewmodels;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.itstep.mylists.R;
import com.itstep.mylists.adapters.ListViewTechnologyAdapter;
import com.itstep.mylists.repositories.TechnologyRepository;
import com.itstep.mylists.views.TechnologyActivity;

public class TechnologyViewModel {

    private final TechnologyRepository repository;
    private final TechnologyActivity activity;

    public TechnologyViewModel(TechnologyActivity activity) {
        this.activity  = activity;
        this.repository = TechnologyRepository.getInstance();

        listView = activity.findViewById(R.id.lst_technology);

        createList();
    }


    public void createList() {
        ListViewTechnologyAdapter adapter = new ListViewTechnologyAdapter(this.activity, R.layout.technology_list_item_view, repository.getData());
        listView.setAdapter(adapter);



    }


    ListView listView;


}
