package com.vaibhavmojidra.androidjavademo2dagger2module;

import dagger.Component;

@Component(modules = {InternetModule.class,GameModule.class})
public interface PlayGameIComponent {
    PlayGame getPlayGame();
}
