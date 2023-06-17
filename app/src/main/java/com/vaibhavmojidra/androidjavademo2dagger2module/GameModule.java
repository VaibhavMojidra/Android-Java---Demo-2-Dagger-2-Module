package com.vaibhavmojidra.androidjavademo2dagger2module;

import dagger.Module;
import dagger.Provides;

@Module
public class GameModule {

    @Provides
    Game providesGame(){
        return new Game();
    }
}
