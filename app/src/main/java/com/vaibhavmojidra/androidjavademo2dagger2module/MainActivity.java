package com.vaibhavmojidra.androidjavademo2dagger2module;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerPlayGameIComponent.create().getPlayGame().playGame();
    }
}