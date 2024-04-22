package com.itstep.mymvvm.mvvm;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.itstep.mymvvm.MainActivity;
import com.itstep.mymvvm.R;
import com.itstep.mymvvm.models.UserModel;

public class UserViewModelManual implements OnModelChangeEvent
{

    private final UserModel model;
    private final MainActivity activity;

    public UserViewModelManual(MainActivity activity, UserModel model){
        this.activity = activity;
        this.model = model;
        this.model.setViewModel(this);
    }

    public void connectTwoWay() {
        TextInputEditText txtEmail = activity.findViewById(R.id.user_email);

        txtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                // Контролирую процесс обновления поля - можно здесь
                // if(!s.toString().equals(model.getEmail()))
                    model.setEmail(s.toString());
            }
        });
    }


    /**
     * OneWay
     */
    public void fromModelToView() {
        TextView txtId = activity.findViewById(R.id.user_id);
        txtId.setText(model.getId().toString());

        TextInputEditText txtEmail = activity.findViewById(R.id.user_email);
        txtEmail.setText(model.getEmail());
    }

    /**
     * OneWayToSource
     */
    public void fromViewToModel() {
        TextInputEditText txtEmail = activity.findViewById(R.id.user_email);
        model.setEmail(txtEmail.getText().toString());
    }

    /**
     * В этом интерфейсе мы описываем, процесс обновления полей, в случае обновления модели
     */
    @Override
    public void onModelChangeEvent() {
        // Если речь идет о статических полях - то никаких проблем у меня не возникает
        ((TextView) activity.findViewById(R.id.user_dev)).setText(model.getEmail());

        // Еще эффективнее контролировать перересовку тут - что бы зря не обновлять формы
        TextInputEditText txtEmail = activity.findViewById(R.id.user_email);
        if (!txtEmail.getText().toString().equals(model.getEmail()))
            txtEmail.setText(model.getEmail());
    }
}
