package com.example.micha.alc4phaseone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        getSupportActionBar().setTitle(R.string.my_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
