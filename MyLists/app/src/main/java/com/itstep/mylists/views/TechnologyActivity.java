package com.itstep.mylists.views;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.itstep.mylists.R;
import com.itstep.mylists.viewmodels.TechnologyViewModel;

public class TechnologyActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.technology_view);

        TechnologyViewModel viewModel = new TechnologyViewModel(this);
    }


}