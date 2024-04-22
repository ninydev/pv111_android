package com.itstep.mylists;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.itstep.mylists.repositories.CountryStringsRepository;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ListView lstCountries = findViewById(R.id.lst_countries);

        String[] countries = CountryStringsRepository.getData();

//        ArrayAdapter<String> adapter = new ArrayAdapter<>
//                (this,
//                        R.layout.my_simple_list_item_1,
//                        // android.R.layout.simple_list_item_1,
//                        countries
//                );


        ArrayAdapter<String> adapter = CountryStringsRepository.getArrayAdapter(this);
        lstCountries.setAdapter(adapter);




    }
}