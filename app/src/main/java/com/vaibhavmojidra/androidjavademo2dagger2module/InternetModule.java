package com.vaibhavmojidra.androidjavademo2dagger2module;

import dagger.Module;
import dagger.Provides;

@Module
public class InternetModule {

    @Provides
    Internet providesInternet(){
        return new Internet();
    }
}
