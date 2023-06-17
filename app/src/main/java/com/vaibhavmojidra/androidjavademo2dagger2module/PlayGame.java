package com.vaibhavmojidra.androidjavademo2dagger2module;

import android.util.Log;

import javax.inject.Inject;

public class PlayGame {
    private Game game;
    private SmartPhone smartPhone;
    private Internet internet;

    @Inject
    public PlayGame(Game game, SmartPhone smartPhone, Internet internet) {
        this.game = game;
        this.smartPhone = smartPhone;
        this.internet = internet;
        game.isGameDownloaded();
        smartPhone.doesSmartphoneSupportsTheGame();
        internet.isInternetAvailable();
        Log.i("MyTag","PlayGame class initialized");
    }

    void playGame(){
        Log.i("MyTag","Game is ready to play");
    }
}
