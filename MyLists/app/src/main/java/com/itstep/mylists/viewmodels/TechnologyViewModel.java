package com.itstep.mylists.viewmodels;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.itstep.mylists.R;
import com.itstep.mylists.adapters.ListViewTechnologyAdapter;
import com.itstep.mylists.models.TechnologyModel;
import com.itstep.mylists.repositories.TechnologyRepository;
import com.itstep.mylists.views.TechnologyActivity;

public class TechnologyViewModel {

    private final TechnologyRepository repository;
    private final TechnologyActivity activity;

    ListViewTechnologyAdapter listViewAdapter;

    public TechnologyViewModel(TechnologyActivity activity) {
        this.activity  = activity;
        this.repository = TechnologyRepository.getInstance();

        listView = activity.findViewById(R.id.lst_technology);

        createList();
    }


    public void createList() {
        listViewAdapter = new ListViewTechnologyAdapter(this.activity, R.layout.technology_list_item_view, repository.getData());
        listView.setAdapter(listViewAdapter);

        EditText txtName = activity.findViewById(R.id.technology_input_name);
        EditText txtAge = activity.findViewById(R.id.technology_input_age);

        Button create = activity.findViewById(R.id.technology_btn_create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TechnologyModel newModel = TechnologyRepository.createModel();
                newModel.setName(txtName.getText().toString());
                newModel.setAge(Integer.parseInt(txtAge.getText().toString()));

                repository.add(newModel);

                listViewAdapter.notifyDataSetChanged();

                txtAge.setText(null);
                txtName.setText(null);

            }
        });

    }


    ListView listView;


}
