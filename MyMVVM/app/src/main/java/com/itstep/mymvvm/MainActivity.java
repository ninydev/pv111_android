package com.itstep.mymvvm;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.itstep.mymvvm.models.UserModel;
import com.itstep.mymvvm.mvvm.UserViewModelManual;
import com.itstep.mymvvm.repositories.UserRepository;

public class MainActivity extends AppCompatActivity {

    UserViewModelManual userMvvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.user_view);



        UserModel userModel = UserRepository.createModel();
        userMvvm = new UserViewModelManual(this,userModel);

        userMvvm.fromModelToView();

        userMvvm.connectTwoWay();
    }
}