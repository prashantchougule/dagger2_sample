package com.example.daggersample.di.modules;

import com.example.daggersample.Engine;
import com.example.daggersample.PetrolEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }
}
