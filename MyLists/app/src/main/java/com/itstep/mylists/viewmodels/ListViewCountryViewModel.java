package com.itstep.mylists.viewmodels;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.itstep.mylists.R;
import com.itstep.mylists.repositories.CountryStringsRepository;

public class ListViewCountryViewModel {

    public static ArrayAdapter<String> getArrayAdapterForSpinner(Context activity){
        return new ArrayAdapter<>(activity, android.R.layout.simple_spinner_item, CountryStringsRepository.getData() );
    }


    public static ArrayAdapter<String> getArrayAdapterForListView(Context activity){
        return new ArrayAdapter<>(activity, R.layout.my_simple_list_item_1, CountryStringsRepository.getData() );
    }
}
