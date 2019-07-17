package com.example.micha.alc4phaseone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutAlc, myProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        createListeners();
    }
    public void init(){
        aboutAlc = findViewById(R.id.button_about_alc);
        myProfile = findViewById(R.id.button_my_profile);
    }
    public void createListeners(){
        aboutAlc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, AboutALCActivity.class));
                    }
                }
        );
        myProfile.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(MainActivity.this, MyProfileActivity.class));
                    }
                }
        );
    }

}
