package com.example.daggersample.di.modules;

import com.example.daggersample.DieselEngine;
import com.example.daggersample.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine BindsEngine(DieselEngine dieselEngine);
}
