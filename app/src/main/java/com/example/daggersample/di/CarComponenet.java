package com.example.daggersample.di;

import com.example.daggersample.Car;

import dagger.Module;

@Module
public interface CarComponenet {

    Car getCar();
}
