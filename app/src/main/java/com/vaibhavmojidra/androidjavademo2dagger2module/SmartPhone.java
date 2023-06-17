package com.vaibhavmojidra.androidjavademo2dagger2module;

import android.util.Log;

import javax.inject.Inject;

public class SmartPhone {

    @Inject
    public SmartPhone() {
        Log.i("MyTag","SmartPhone class initialized");
    }

    void doesSmartphoneSupportsTheGame(){
        Log.i("MyTag","Smartphone supports gaming");
    }
}
