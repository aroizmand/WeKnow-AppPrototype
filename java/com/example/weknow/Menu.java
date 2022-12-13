package com.example.weknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void onClickHome(View view){
        Intent intent = new Intent(this, Explore.class);
        startActivity(intent);
    }

    public void onClickMatches(View view){
        Intent intent = new Intent(this, Match.class);
        startActivity(intent);
    }

    public void onClickChat(View view){
        Intent intent = new Intent(this, ChatMain.class);
        startActivity(intent);
    }

    public void onClickProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void onClickResources(View view) {
        Intent intent = new Intent(this, Resources.class);
        startActivity(intent);
    }




}