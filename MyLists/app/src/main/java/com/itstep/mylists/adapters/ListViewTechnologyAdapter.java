package com.itstep.mylists.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.itstep.mylists.R;
import com.itstep.mylists.models.TechnologyModel;

import java.util.ArrayList;


/**
 * Устанавливает правила для вывода ЭЛЕМЕНТА списка!!!
 */
public class ListViewTechnologyAdapter extends ArrayAdapter<TechnologyModel>
{

    LayoutInflater layoutInflater;
    int layout;



    ArrayList<TechnologyModel> models;

    /**
     *
     * @param context - текущая активити
     * @param layout - layout для вывода элемента
     * @param models - передача параметром данных ГАРАНТИРУЕТ то, что данные уже есть
     */
    public ListViewTechnologyAdapter(@NonNull Context context, int layout, ArrayList<TechnologyModel> models) {
        super(context, layout, models);
        this.models = models;
        this.layout = layout;
        this.layoutInflater = LayoutInflater.from(context);
    }

    /**
     *
     * @param position The position of the item within the adapter's data set of the item whose view
     *        we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *        is non-null and of an appropriate type before using. If it is not possible to convert
     *        this view to display the correct data, this method can create a new view.
     *        Heterogeneous lists can specify their number of view types, so that this View is
     *        always of the right type (see {@link #getViewTypeCount()} and
     *        {@link #getItemViewType(int)}).
     * @param parent The parent that this view will eventually be attached to
     * @return
     */
    public View getView(int position, View convertView, ViewGroup parent) {


        // Если элемент еще не создавался - то его нужно создать первый раз
        if (convertView == null) {
            convertView = layoutInflater.inflate(layout, parent, false);
        }

        TextView txtName = ((TextView)convertView.findViewById(R.id.technology_name));
        TextView txtAge = ((TextView)convertView.findViewById(R.id.technology_age));

        txtName.setText(models.get(position).getName());
        txtAge.setText(" => " + models.get(position).getAge());

        Button del = convertView.findViewById(R.id.technology_btn_del);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                models.remove(position);
                // Сообщить адаптеру (и закрепленным за ним списком) что нужно обновить данные
                notifyDataSetChanged();
            }
        });

//        Button add = convertView.findViewById(R.id.add_age);
//        add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                TechnologyModel m = models.get(position);
//                m.setAge(m.getAge()+1);
//                Log.d("keeper", " " + m.getAge());
//                txtAge.setText(" + " + m.getAge());
//
//            }
//        });

        return convertView;
    }


}
