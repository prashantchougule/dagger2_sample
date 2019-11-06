package com.example.daggersample.di.modules;

import com.example.daggersample.Rims;
import com.example.daggersample.Tires;
import com.example.daggersample.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return  tires;
    }

    @Provides
    Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }
}
