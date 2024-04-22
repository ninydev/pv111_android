package com.itstep.mymvvm.mvvm;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.itstep.mymvvm.MainActivity;
import com.itstep.mymvvm.R;
import com.itstep.mymvvm.models.UserModel;

public class UserMvvm {

    private UserModel model;
    private MainActivity activity;

    public UserMvvm(MainActivity activity, UserModel model){
        this.activity = activity;
        this.model = model;
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
                model.setEmail(s.toString());
                ((TextView) activity.findViewById(R.id.user_dev)).setText(model.getEmail());
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

}
