package com.itstep.mylists;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.itstep.mylists.repositories.CountryStringsRepository;
import com.itstep.mylists.viewmodels.ListViewCountryViewModel;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


    }



//
//    private void listExample() {
//        ListView lstCountries = findViewById(R.id.lst_countries);
//
//        ArrayAdapter<String> adapterForListView = ListViewCountryViewModel.getArrayAdapterForListView(this);
//        lstCountries.setAdapter(adapterForListView);
//
//        lstCountries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(view.getContext(), "Position" + position, Toast.LENGTH_LONG).show();
//            }
//        });
//
//        Spinner spinnerCountries = findViewById(R.id.spinner_countries);
//        ArrayAdapter<String> adapterForSpinner = ListViewCountryViewModel.getArrayAdapterForSpinner(this);
//        adapterForSpinner.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
//        spinnerCountries.setAdapter(adapterForSpinner);
//
//        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(view.getContext(), "Position" + position, Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
// }

}