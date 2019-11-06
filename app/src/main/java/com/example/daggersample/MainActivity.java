package com.example.daggersample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggersample.di.components.CarComponenet;
import com.example.daggersample.di.DaggerCarComponenet;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponenet carComponenet = DaggerCarComponenet.create();
        carComponenet.inject(this);

        car.drive();
    }
}
