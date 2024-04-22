package com.itstep.mylists.repositories;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.itstep.mylists.R;

public class CountryStringsRepository {
    private static String [] data = {"Usa", "Ukraine", "Gemany"};

    public static String[] getData() {
        return data;
    }

    public static ArrayAdapter<String> getArrayAdapter(Context activity){
        return new ArrayAdapter<>(activity, R.layout.my_simple_list_item_1, data );
    }
}
