package com.example.daggersample;

import android.util.Log;

import javax.inject.Inject;

public class PetrolEngine implements Engine {

    private static final String TAG = "car";

    @Inject
    PetrolEngine(){

    }
    @Override
    public void start() {
        Log.d(TAG, "PetrolEngine started");
    }
}
