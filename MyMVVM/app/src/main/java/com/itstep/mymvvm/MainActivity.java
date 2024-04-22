package com.itstep.mymvvm;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.itstep.mymvvm.models.UserModel;
import com.itstep.mymvvm.mvvm.UserMvvm;
import com.itstep.mymvvm.repositories.UserRepository;

public class MainActivity extends AppCompatActivity {

    UserMvvm userMvvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.user_view);



        UserModel userModel = UserRepository.createModel();
        userMvvm = new UserMvvm(this,userModel);

        userMvvm.fromModelToView();

        userMvvm.connectTwoWay();
    }
}