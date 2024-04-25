package com.itstep.mylists.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.itstep.mylists.R;
import com.itstep.mylists.models.TechnologyModel;

import java.util.ArrayList;

public class SpinnerTechnologyAdapter extends ArrayAdapter<TechnologyModel>
{
    LayoutInflater layoutInflater;
    int layout;

    ArrayList<TechnologyModel> models;

    public SpinnerTechnologyAdapter(@NonNull Context context, int layout, ArrayList<TechnologyModel> models) {
        super(context, layout, models);
        this.models = models;
        this.layout = layout;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, @NonNull ViewGroup parent) {
        Log.d("keeper", "spinner getView: " + position);

        // Если элемент еще не создавался - то его нужно создать первый раз
        if (convertView == null) {
            convertView = layoutInflater.inflate(layout, parent, false);
        }

        TextView txtName = ((TextView)convertView.findViewById(R.id.text_view_name));
        TextView txtAge = ((TextView)convertView.findViewById(R.id.text_view_age));

        txtName.setText(models.get(position).getName());
        txtAge.setText(" => " + models.get(position).getAge());

        return convertView;
    }


}
