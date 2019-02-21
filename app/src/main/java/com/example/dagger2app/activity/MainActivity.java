package com.example.dagger2app.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dagger2app.R;
import com.example.dagger2app.activity.di.ActivityComponent;



public class MainActivity extends AppCompatActivity {

    ActivityComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        component = DaggerActivityComponent.builder()
//                .activityModule(new ActivityModule())
//                .build();

    }
}
