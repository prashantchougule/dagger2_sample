package com.example.daggersample;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "car";

    @Inject
    public DieselEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "DieselEngine started");
    }
}
