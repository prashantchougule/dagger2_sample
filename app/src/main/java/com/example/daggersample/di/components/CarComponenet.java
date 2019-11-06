package com.example.daggersample.di.components;

import com.example.daggersample.Car;
import com.example.daggersample.MainActivity;
import com.example.daggersample.di.modules.DieselEngineModule;
import com.example.daggersample.di.modules.WheelsModule;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponenet {

    Car getCar();

    void inject(MainActivity mainActivity);
}
