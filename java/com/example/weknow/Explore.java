package com.example.weknow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


public class Explore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
    }

    public void onClickMusic(View view){
        Intent intent = new Intent(this, Music.class);
        startActivity(intent);
    }

    public void onClickOutdoors(View view){
        Intent intent = new Intent(this, Outdoors.class);
        startActivity(intent);
    }

    public void onClickSports(View view){
        Intent intent = new Intent(this, Sports.class);
        startActivity(intent);
    }

    public void onClickMedia(View view){
        Intent intent = new Intent(this, Media.class);
        startActivity(intent);
    }

    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onClickMenu(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}